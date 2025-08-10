public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String candidate = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            int minLen = Math.min(candidate.length(), strs[i].length());

            while (j < minLen && candidate.charAt(j) == strs[i].charAt(j)) {
                j++;
            }

            candidate = candidate.substring(0, j);

            if (candidate.isEmpty()) {
                break;
            }

        }
        return candidate;
    }

    public static void main(String[] args) {
        String result = longestCommonPrefix(new String[] {"flower","flow","flight"});
        System.out.println(result);
    }
}
