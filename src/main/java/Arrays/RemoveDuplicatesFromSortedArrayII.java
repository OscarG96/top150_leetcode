package Arrays;

public class RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        int write_index = 0;
        for (int read_index = 0; read_index < nums.length; read_index++) {
            if (write_index < 2) {
                nums[write_index] = nums[read_index];
                write_index += 1;
            } else {
                if (nums[write_index - 1] == nums[read_index] && nums[write_index - 2] == nums[read_index]) {
                    continue;
                } else {
                    nums[write_index] = nums[read_index];
                    write_index += 1;
                }
            }
        }
        return write_index;
    }

    public static void main(String[] args) {
        int result = removeDuplicates(new int[]{1,1,1,2,2,3});
        System.out.println(result);
    }
}
