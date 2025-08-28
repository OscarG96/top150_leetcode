package TwoPointers;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {

        String t = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        boolean result = true;
        int left = 0;
        int right = t.length() - 1;
        while (left < right) {
            if (t.charAt(left) != t.charAt(right)) {
                result = false;
                break;
            }
            left++;
            right--;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = " ";
        System.out.println(isPalindrome(s));
    }
}
