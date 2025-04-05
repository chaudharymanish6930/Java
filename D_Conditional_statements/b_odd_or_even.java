package D_Conditional_statements;

import java.util.Scanner;

public class b_odd_or_even {
    public static void main(String[]args) {
        Scanner a = new Scanner(System.in);
        System.out.print("enter your age: ");
        int num = a.nextInt();
        System.out.println("your entered age: " + num);

        if (num%2==0) {
            System.out.println("entered number is even");
        } else {
            System.out.println("entered number is odd");
        }
    }
}
