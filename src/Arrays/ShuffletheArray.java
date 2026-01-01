package Arrays;

public class ShuffletheArray {
    static void main() {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] ansNums = shuffleArray(nums, n);
        int i=0;
        for (int x:ansNums){
            System.out.print(x+" ");
        }
    }

    private static int[] shuffleArray(int[] nums, int n) {
        int[] nums2 = new int[n * 2];
        int counter = 0;
        int i = 0;
        while (i < n) {
            nums2[counter] = nums[i];
            nums2[counter + 1] = nums[i + n];
            i++;
            counter += 2;
        }
        return nums2;
    }
}
