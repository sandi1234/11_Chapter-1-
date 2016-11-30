import java.util.*;

// import java.io.*;
public class Alternate {
    public static void main(String[] args) {

        List<Integer> number1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> number2 = Arrays.asList(6, 7, 8, 9, 10, 11, 12);


        System.out.println(alterne(number1, number2));


    }

    public static List<Integer> alterne(List<Integer> list1, List<Integer> list2) {
        List<Integer> alternateList = new ArrayList<>();
        int listSize1 = list1.size();
        int listSize2 = list2.size();

        int biggest;
        if (listSize1 >= listSize2) {
            biggest = listSize1;
        } else {
            biggest = listSize2;
        }

        for (int i = 0; i < biggest; i++) {
            if (i < listSize1) {
                alternateList.add(list1.get(i));
            }
            if (i < listSize2) {
                alternateList.add(list2.get(i));
            }

        }
        return alternateList;
    }


}