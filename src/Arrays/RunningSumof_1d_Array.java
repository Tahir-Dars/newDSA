package Arrays;

public class RunningSumof_1d_Array {
    static void main() {
        int[] nums = {3,1,2,10,1};
        int[] nums2 = buildArray(nums);
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
    }

    private static int[] buildArray(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
           nums[i]+=nums[i-1];
        }
        return nums;
    }
}
