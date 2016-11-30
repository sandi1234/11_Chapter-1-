import java.util.*;

public class MinLength {
    public static void main(String[] args) {
        List<String> list = Arrays.asList();


        System.out.println(minLength(list));

    }

    private static int minLength(List<String> list) {

        int stringCount = 0;

        if(!list.isEmpty()){
            stringCount = list.get(0).length(); // get the first index in a list and asign its length to stringCount
        }

        for (String s : list) {
            if(s.length() < stringCount){
                stringCount = s.length();
            }
        }

        return stringCount;
    }
}
