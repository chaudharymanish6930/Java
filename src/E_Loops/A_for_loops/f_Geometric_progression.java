package E_Loops.A_for_loops;

import java.util.Scanner;

public class f_Geometric_progression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting element of the AP:");
        int a=sc.nextInt();
        System.out.print("Enter the differnce of the AP:");
        int r = sc.nextInt();
        System.out.print("Enter a Number:");
        int n = sc.nextInt();

        int gp = a;
        for(int i=1; i<=n; i++){
            System.out.println(gp);
            gp = gp*r;
        }
    }
}
