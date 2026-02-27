package L_Recursion;
import java.util.Scanner;
public class a_counting_byRecursion {
    public static void printvalue(int n){
        if(n==0) return;

        System.out.print(n+" ");
        printvalue(n-1);
        System.out.print(n+" ");
        // make a palindrome number by the recursion
    }

    public static void main(String[]args){
        Scanner a= new Scanner(System.in);
        System.out.print("enter a number: ");
        int x=a.nextInt();
        printvalue(x);
    }
}
