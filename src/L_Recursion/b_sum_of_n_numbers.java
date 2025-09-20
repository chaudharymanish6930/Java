package L_Recursion;
import java.util.Scanner;
public class b_sum_of_n_numbers {
    public static int sum(int n){
//        System.out.println(n);
        int sum=0;
        sum=sum+n;
        if(n==0){
            return sum;
        }
        sum(n-1);
        return sum;
    }

    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter a input: ");
        int x=a.nextInt();
        int y=sum(x);
        System.out.println(y);
        System.out.println("finally....");
    }
}
