import java.util.Arrays;
import java.util.HashSet;

public class SymmetricSetDifference {

    public static void main(String[] args) {
        HashSet<Integer> integers1 = new HashSet<>(Arrays.asList(1, 4, 7, 9));
        HashSet<Integer> integers2 = new HashSet<>(Arrays.asList(2, 4, 5, 6, 7));
        System.out.println(symmetricSetDifference(integers1, integers2));

    }

    private static HashSet<Integer> symmetricSetDifference(HashSet<Integer> integers1, HashSet<Integer> integers2) {
        HashSet<Integer> longSet = new HashSet<Integer>();
        HashSet<Integer> shortSet = new HashSet<Integer>();
        HashSet<Integer> diffSet = new HashSet<Integer>();


        if(new HashSet<Integer>(integers1).size() >= new HashSet<Integer>(integers2).size()){
            longSet.addAll(integers1);
            shortSet.addAll(integers2);
        } else{
            longSet.addAll(integers2);
            shortSet.addAll(integers1);
        }

        for (Integer integer : longSet)
        {
            if (!shortSet.contains(integer)){

                diffSet.add(integer);
            }

        }

        for (Integer integer : shortSet)
        {
            if (!longSet.contains(integer)){

                diffSet.add(integer);
            }

        }

        return diffSet;
    }
}
