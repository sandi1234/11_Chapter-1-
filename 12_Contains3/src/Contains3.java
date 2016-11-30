import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Contains3 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ko", "ko", "ko", "troldmand", "sko", "sko,", "lort", "lort");
        System.out.println(contains3(strings));

    }

    private static boolean contains3(List<String> strings) {

        HashMap<String, Integer> stringIntegers = new HashMap<>();

        for (String string : strings) {
            if(!stringIntegers.containsKey(string)){
                stringIntegers.put(string, 1);
            } else {
                stringIntegers.put(string, stringIntegers.get(string) + 1);
            }
        }

        if(stringIntegers.containsValue(3)){
            return true;
        }

        return false;
    }


}
