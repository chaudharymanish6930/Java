package E_Loops.B_while_loops;

import java.util.Scanner;

public class d_digit_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        while(n>=0){
            n/=10;
            count++;
        }
        System.out.println(count);
    }
}
