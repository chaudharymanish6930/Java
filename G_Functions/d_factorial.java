package G_Functions;

import java.util.Scanner;

public class d_factorial {
    public static int factorial(int n){
        int factorial=1;

        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return factorial;
    }

    public static void main(String[]args){
    Scanner a=new Scanner(System.in);
        System.out.println("enter a number: ");
    int x=a.nextInt();
    int y=factorial(x);
        System.out.println("factorial: "+y);
    }
}
