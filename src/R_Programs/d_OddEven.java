package R_Programs;

import java.util.Scanner;

public class d_OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;  // outside

        do {
            System.out.println("hello user...");
            System.out.print("enter your choice 'yes or no': ");
            choice = scanner.nextLine();

            switch (choice.toLowerCase()) {
                case "yes":
                    System.out.print("enter a number :");
                    int num = scanner.nextInt();
                    if (num % 2 == 0) {
                        System.out.println("the number is even :" + num);
                    } else {
                        System.out.println("the numbber is odd :" + num);
                    }
                    break;

                case "no":
                    System.out.println("thank you");
                    break;

                default:
                    System.out.println("not valid");
            }
        }while (choice.equalsIgnoreCase("yes"));
    }
}
