import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CountCommon {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        List<Integer> list2 = Arrays.asList(-5, 15, 2, -1, 7,15, 36);

        System.out.println(countCommon(list1, list2));

    }

    private static int countCommon(List<Integer> list1, List<Integer> list2) {

        int count = 0;
        HashSet<Integer> longSet = new HashSet<Integer>();
        HashSet<Integer> shortSet = new HashSet<Integer>();

        if(new HashSet<Integer>(list1).size() >= new HashSet<Integer>(list2).size()){
            longSet.addAll(list1);
            shortSet.addAll(list2);
        } else{
            longSet.addAll(list2);
            shortSet.addAll(list1);
        }

        for (Integer integer : longSet)
        {
            if (Collections.frequency(shortSet, integer) >= 1 ){
                count++;
            }
        }

        return count;
    }

}
