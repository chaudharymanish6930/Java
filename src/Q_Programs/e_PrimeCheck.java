package Q_Programs;

import java.util.Scanner;

public class e_PrimeCheck {
    public static void CheckNumber(int age){
        if(age<=1){
            System.out.println("not valid or 1 is not a prime number");
            return;
        }
        boolean flag = true;
        for(int i =2; i<age; i++){
            if(age%i ==0){
               flag = false;
            }
        }
        if(flag){
            System.out.println("it is a prime number");
        }
        else{
            System.out.println("it is not a prime number");
        }
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("enter a number: ");
        int age = scanner.nextInt();
        CheckNumber(age);
    }
}
