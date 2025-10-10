package TwoPointers;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while (left < right) {
            int min = Math.min(height[left], height[right]);
            int water = min * (right - left);
            maxWater = Math.max(maxWater, water);

            if (height[left] < height[right]) {
                left++;
            } else if (height[right] < height[left]) {
                right--;
            } else {
                left++;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int area = maxArea(new int[] {1,1});
        System.out.println(area);
    }
}
