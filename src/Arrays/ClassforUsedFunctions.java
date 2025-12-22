package Arrays;

import java.util.Scanner;

public class ClassforUsedFunctions {
    public static int maxfinder(int[] arr){
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.println(value);
        }
    }
    public static int[] processArray(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }
}
