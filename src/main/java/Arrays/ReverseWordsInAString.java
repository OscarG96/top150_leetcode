package Arrays;

import java.util.ArrayList;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        String[] splitString = s.trim().split("\\s+");
        ArrayList<String> result = new ArrayList<>();
        for (int i = splitString.length - 1; i >= 0; i--) {
            result.add(splitString[i]);
        }
        return String.join(" ", result);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
}
