package Arrays;

import java.util.Objects;

public class IntegerToRoman {

    public static String intToRoman(int num) {
        String roman = "";
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] sybols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman += sybols[i];
            }
        }

        return roman;
    }

    public static void main(String[] args) {
        String result = intToRoman(3749);
        assert Objects.equals(result, "MMMDCCXLIX") : "Roman is correct";
        System.out.println(result);
    }

}
