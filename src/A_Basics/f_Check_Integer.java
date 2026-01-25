package A_Basics;

import java.util.Scanner;

public class f_Check_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n-(int)n==0){
            System.out.println("It is a Integer");
        }
        else{
            System.out.println("It is not a Integer");
        }
    }
}
