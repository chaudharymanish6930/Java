package Q_Programs;

import java.util.Scanner;

public class b_SumAllDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number: ");
        int digit = scanner.nextInt();

        int sum=0;
        while(digit>0){  // (digit !=0)
            int num = digit%10;  // to find the remainder
            sum +=num;
            digit = digit/10;   // remove the last digit
        }

        System.out.println("sum of digit: "+sum);
    }
}
