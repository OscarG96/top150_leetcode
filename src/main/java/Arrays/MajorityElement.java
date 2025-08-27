package Arrays;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
            int candidate = nums[0];
            int count = 1;

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == candidate) {
                    count++;
                } else {
                    count--;
                    if (count == 0) {
                        candidate = nums[i];
                        count = 1;
                    }
                }
            }
            return candidate;
    }
    public static void main(String[] args) {
        int result = majorityElement(new int[]{2,2,1,1,1,2,2});
        System.out.println(result);
    }
}
