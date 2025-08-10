import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> romans = new HashMap<>();

        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        //loop through each and add
        //check if the current is less than the next, then subtract, if not just add
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i + 1 < s.length() && romans.get(c) < romans.get(s.charAt(i + 1))) {
                // Subtract from the result
                result -= romans.get(c);
            } else {
                // Add to the result
                result += romans.get(c);
            }
        }

    return result;

    }

    public static void main(String[] args) {
        String s = "III";
        int result = romanToInt(s);
        System.out.println("result " + result);
    }
}
