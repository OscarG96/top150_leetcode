package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        int target = 0;
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int anchor = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = anchor + nums[left] + nums[right];
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    List<Integer> innerList = new ArrayList<>();
                    innerList.add(anchor);
                    innerList.add(nums[left]);
                    innerList.add(nums[right]);
                    resultList.add(innerList);

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
            }

        }
        return resultList;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[] {-1,0,1,2,-1,-4}));
    }
}
