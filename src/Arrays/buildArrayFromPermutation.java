package Arrays;

public class buildArrayFromPermutation {
    static void main() {
        int []nums= {5,0,1,2,3,4};
      nums=buildArray(nums);
        for (int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    private static int[] buildArray(int[] nums) {
        int []nums2=new int[nums.length];
        for (int i=0;i<nums2.length;i++){
            nums2[i]=nums[nums[i]];
        }
        return nums2;
    }
}
