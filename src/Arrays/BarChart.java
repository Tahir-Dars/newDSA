package Arrays;


import static Arrays.ClassforUsedFunctions.maxfinder;

public class BarChart {
    static void main() {
        int[] arr ={5,4,7,2};
        int max= maxfinder(arr);
        int maxClone=max;
        for (int i=1;i<=maxClone;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[j]>=max){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            max--;
            System.out.println();
        }

    }

}
