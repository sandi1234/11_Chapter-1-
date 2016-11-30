import java.util.*; // for Scanner
import java.io.*;
  public class Partition{
    public static void main(String[] args) throws FileNotFoundException{ 
    	List<Integer> numbers = Arrays.asList(15, 1, 6, 12, -3, 4, 8, 21, 2, 30, -1, 9, 5);

        System.out.println();

        System.out.print(partition(numbers, 5));
    }

    public static List<Integer> partition(List<Integer> list, int e){
        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (Integer integer : list) {
            if(integer <= e){
                less.add(integer);
            } else {
                greater.add(integer);
            }
        }
         less.addAll(greater);
        return less;
    }
}