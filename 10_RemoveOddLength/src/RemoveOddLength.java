import java.util.Arrays;
import java.util.HashSet;

public class RemoveOddLength {

    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<String>(Arrays.asList("bo", "sko", "tall", "globe" ));
        System.out.println(removeOddLength(strings));

    }

    private static HashSet<String> removeOddLength(HashSet<String> strings) {

        HashSet<String> words = new HashSet<>();

        for (String string : strings) {
                if(string.length() % 2 == 0){
                    words.add(string);
                }
        }

        return words;
    }
}
