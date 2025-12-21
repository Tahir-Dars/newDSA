package Arrays;

public class SpanOfArray {
    static void main() {
        int [] arr={7,7,9,3,7,3};
        int max=arr[0];
        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Span of Array is: "+(max-min));
    }
}
