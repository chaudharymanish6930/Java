package K_Operators.E_Logical_Operators;

import java.util.Scanner;

public class e_Add_byLogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        System.out.print("Enter another Number: ");
        int b = sc.nextInt();

        if(b==0){
            System.out.println("Addition is : "+a);
        }
        while(b!=0){
            int carry = (a&b) <<1;
            a = a^b;
            b=carry;
        }
        System.out.println("Addition is : "+a);
    }
}