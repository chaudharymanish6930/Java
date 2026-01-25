package E_Loops.B_while_loops;

import java.util.Scanner;

public class f_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact =1;
        for(int i=1; i<=n; i++){
            fact *=i;
        }
        System.out.println(fact);
    }
}
