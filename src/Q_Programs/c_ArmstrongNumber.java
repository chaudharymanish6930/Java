package Q_Programs;

import java.util.*;

public class c_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number of 3-digit: ");
        int num = scanner.nextInt();
        int original = num;
        int sum=0;
        while(num>0){
            int digit = num%10;
            int cube = digit * digit * digit;
            sum +=cube;
            num = num/10;
        }

        if(original == sum){
            System.out.println("The number is Armstrong" + " :"+ sum);
        }
        else {
            System.out.println("Not a Armstrong number");
        }
    }
}
