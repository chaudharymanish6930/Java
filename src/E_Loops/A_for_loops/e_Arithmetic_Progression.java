package E_Loops.A_for_loops;

import java.util.Scanner;

public class e_Arithmetic_Progression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting element of the AP:");
        int a=sc.nextInt();
        System.out.print("Enter the differnce of the AP:");
        int d = sc.nextInt();
        System.out.print("Enter a Number:");
        int n = sc.nextInt();

        int lastTerm = a + (n - 1) * d;
        for(int i=a; i<=lastTerm; i+=d){
            System.out.println(i);
        }
    }
}
