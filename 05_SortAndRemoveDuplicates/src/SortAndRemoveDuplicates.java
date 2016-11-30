import java.util.*; 
  public class SortAndRemoveDuplicates{ 
    public static void main(String[] args){
    	List<Integer> num = Arrays.asList(7, 4, -9, 4, 15, 8, 27, 7, 11, -5, 32, -9, -9);


		System.out.println(sortAndRemoveDuplicates(num));


 	}

	  public static List<Integer> sortAndRemoveDuplicates(List<Integer> list) {
		  Set<Integer> noDuplicates = new HashSet<Integer>();
		  noDuplicates.addAll(list);

		  List<Integer> integers = new ArrayList<>();

		  integers.addAll(noDuplicates);

		  Collections.sort(integers);

		  return integers;
	  }

 }