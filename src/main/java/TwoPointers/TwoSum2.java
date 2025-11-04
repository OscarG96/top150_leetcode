package TwoPointers;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            int diff = target - numbers[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff) + 1, i + 1};
            }
            map.put(numbers[i], i);
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1,2,3,4}, 6)));
    }
}
