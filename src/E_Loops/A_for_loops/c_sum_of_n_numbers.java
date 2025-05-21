package E_Loops.A_for_loops;

import java.util.Scanner;

public class c_sum_of_n_numbers {
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        System.out.print("enter the number: ");
        int n=a.nextInt();

        int sum=0;
        for (int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum of n numbers"+sum);
    }
}
