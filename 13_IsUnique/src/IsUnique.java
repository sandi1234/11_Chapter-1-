import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IsUnique {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();


        map.put("Marty", "Stepp");
        map.put("Stuart", "Reges");
        map.put("Jessica", "Miller");
        map.put("Amanda", "Camp");
        map.put("Hal", "Perkins");
        map.put("Kendrick", "Perkins");
        map.put("Stuart", "Reges");
        map.put("Jessica", "Miller");
        map.put("Bruce", "Reges");
        map.put("Hal", "Perkins");

        System.out.println(isunique(map));

    }

    private static boolean isunique(HashMap<String, String> map) {

        HashMap<String, Integer> newMap = new HashMap<>();

        for (String s : map.values()) {

            if(!newMap.containsKey(s)){

                newMap.put(s, 1);

            } else {

                newMap.put(s, newMap.get(s) + 1);
            }
        }

        int count = 0;

        for (Integer integer : newMap.values()) {

            if(count < integer){

                count = integer;
            }
        }

        if(count >= 2){
            return true;

        }

        return false;

    }
}
