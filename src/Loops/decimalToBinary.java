package Loops;

import java.util.Scanner;

public class decimalToBinary {
    static void main() {

        Scanner sk=new Scanner(System.in);
        int num=sk.nextInt();
        StringBuilder binary= new StringBuilder("");
        while(num!=1){
            if (num%2==0){
                binary.append("0");
            } else if (num%2==1){
          binary.append("1");
            }
            num/=2;
        }
        binary.append("1");
        String reversed = new StringBuilder(binary).reverse().toString();
        int ans=Integer.parseInt(reversed) ;
        System.out.println(ans);


    }
}
