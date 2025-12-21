package Arrays;

public class findindexofn {
    static void main() {
        int [] arr={98,9,8,6,63,65,33};
        int n=89;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==n){
                System.out.println("at: "+i);
                return;
            }
        }
        System.out.println("not found");
    }
}
