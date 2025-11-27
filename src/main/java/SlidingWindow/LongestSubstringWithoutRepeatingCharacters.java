package SlidingWindow;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;

        //start both on zero, then move right
        int left = 0;
        int right = 0;

        String currentSubsequence = "";

        while (right < s.length()) {
            char c = s.charAt(right);

            if (!currentSubsequence.contains(String.valueOf(c))) {
                currentSubsequence += c;
                right++;
                maxLength = Math.max(currentSubsequence.length(), maxLength);
            } else {
                while (currentSubsequence.contains(String.valueOf(c))) {
                    currentSubsequence = currentSubsequence.substring(1);
                    left++;
                }

                // IMPORTANT: now add the current character and move right
                currentSubsequence += c;
                right++;
                maxLength = Math.max(maxLength, currentSubsequence.length());
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int result = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb");
        System.out.println(result);
    }
}
