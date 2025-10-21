package R_Programs;

import java.util.Scanner;

public class h_fibbonaciEqualNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int a = 1, b = 1;
        System.out.print(a + " "); // print first Fibonacci number

        while (b <= N) {
            System.out.print(b + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
