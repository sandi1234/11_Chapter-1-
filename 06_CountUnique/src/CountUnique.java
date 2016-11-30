import java.util.*;

public class CountUnique {

    public static void main(String[] args){
        List<Integer> num = Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);


        System.out.println(countUnique(num));


    }

    public static int countUnique(List<Integer> list) {
        int count = 0;
        HashSet<Integer> integers = new HashSet<Integer>(list);

        for (Integer integer : integers)
        {
            if (Collections.frequency(list, integer) >= 1)
                count++;
        }

        return count;
    }

}
