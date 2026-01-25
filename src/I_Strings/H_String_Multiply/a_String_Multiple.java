package I_Strings.H_String_Multiply;

import java.util.Scanner;

public class a_String_Multiple {
     public static String multiplyString(String a, String b){
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        int mul = num1*num2;

        String s = String.valueOf(mul);
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        String a = sc.next();
        System.out.print("Enter the Another NUmber:");
        String b = sc.next();

        String result = multiplyString(a,b);

        System.out.println("Multiply of Numbers:"+result);
    }
}
