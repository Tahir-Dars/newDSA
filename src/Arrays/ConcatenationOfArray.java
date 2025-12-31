package Arrays;

public class ConcatenationOfArray {
    static void main() {
        int[] nums = {1, 2, 1};
        int[] nums2 = buildArray(nums);
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
    }

    private static int[] buildArray(int[] nums) {
        int[] nums2 = new int[nums.length + nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
            nums2[nums.length + i] = nums2[i];
        }
        return nums2;
    }
}
