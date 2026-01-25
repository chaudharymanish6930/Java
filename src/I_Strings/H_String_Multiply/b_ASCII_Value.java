package I_Strings.H_String_Multiply;

import java.util.Scanner;

public class b_ASCII_Value {
    public static String multiplyString(String a, String b){
        if (a.equals("0") || b.equals("0")) {
            return "0";
        }

        int m = a.length();
        int n = b.length();
        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                int digit1 = a.charAt(i) - '0';
                int digit2 = b.charAt(j) - '0';

                int mul = digit1 * digit2;

                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;   // store digit
                result[i + j] += sum / 10;      // carry
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.length() == 0 && num == 0)) {
                sb.append(num);
            }
        }

        return sb.toString();
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
