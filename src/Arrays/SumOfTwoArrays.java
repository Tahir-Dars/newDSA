package Arrays;

import static Arrays.ClassforUsedFunctions.printArray;

public class SumOfTwoArrays {
    static void main() {
        int[] arr1 = {2, 4, 2, 7, 3, 2, 3, 6, 2};
        int[] arr2 = {5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        if (arr1.length > arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] += arr2[i];
            }
            printArray(arr1);

        } else if (arr2.length > arr1.length) {
            for (int i = 0; i < arr1.length; i++) {
                arr2[i] += arr1[i];
            }
            printArray(arr2);

        }

    }
}
