import java.util.Arrays;

public class HIndex {
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);

        int hIndex = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= citations.length - i) {
                hIndex = citations.length - i;
                break;
            }
        }
        return hIndex;
    }

    public static void main(String[] args) {
        int result = hIndex(new int[]{3, 0, 6, 1, 5});
        System.out.println(result);
    }
}
