import java.util.Arrays;
import java.util.HashSet;

public class HasEven {

    public static void main(String[] args) {

        HashSet<Integer> ingtegers = new HashSet<Integer>(Arrays.asList(1, 3, 7, 11));
        System.out.println(hasEven(ingtegers));

    }

    private static boolean hasEven(HashSet<Integer> ingtegers) {

        for (Integer ingteger : ingtegers) {
            if(ingteger % 2 == 0){
                return true;
            }
        }

        return false;
    }


}
