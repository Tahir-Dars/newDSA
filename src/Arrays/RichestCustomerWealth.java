package Arrays;

public class RichestCustomerWealth {
    static void main() {
        int[][] nums = {{1,5},{7,3},{3,5}};
        System.out.println(buildArray(nums));
    }

    private static int buildArray(int[][] nums) {
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                sum += nums[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
            sum = 0;
        }
        return maxSum;
    }
}
