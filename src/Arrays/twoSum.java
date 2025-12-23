package Arrays;

public class twoSum {
    public
    static void main() {
         int [] arr={13,9,3,11,4,7};
         int target=10;
         for (int i=0;i< arr.length;i++){
             for (int j=i+0;j< arr.length;j++){
                 if (arr[i]+arr[j]==target){
                     System.out.println("{"+i+","+j+"}");
                 }
             }
         }
    }
}
