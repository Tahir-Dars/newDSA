package Loops;

import java.util.Scanner;

public class febonacci {
    static void main() {
        Scanner sk = new Scanner(System.in);
        int n = sk.nextInt();
        int a = 0, b = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }
}
