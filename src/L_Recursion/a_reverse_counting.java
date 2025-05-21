package L_Recursion;
import java.util.Scanner;
public class a_reverse_counting {

    public static void printvalue(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printvalue(n-1);
    }
    public static void main(String[]args){
        Scanner a= new Scanner(System.in);
        System.out.print("enter a number: ");
        int x=a.nextInt();
        printvalue(x);
    }
}
