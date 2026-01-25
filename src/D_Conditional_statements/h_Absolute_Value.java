package D_Conditional_statements;

import java.util.Scanner;

public class h_Absolute_Value {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("enter your age: ");
        int num = a.nextInt();
        if(num>=0){
            System.out.println(num);
        }
        else{
            System.out.println(-num);
        }

        System.out.print("enter a double number:");
        double num1=a.nextDouble();
        int x=(int)num1;
        System.out.println(x);

    }
}
