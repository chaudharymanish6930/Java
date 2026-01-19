package A_Basics;

import java.util.Scanner;

public class d_OddEvenByLogical {
    public static boolean isEven(int s){
        if((s & 1)==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int x = sc.nextInt();

        if(isEven(x)==true){
            System.out.println("It is Even Number");
        }
        else{
            System.out.println("It is Odd Number");
        }
    }
}
