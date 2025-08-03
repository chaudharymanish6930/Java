package D_Conditional_statements;

import java.util.*;

public class d_switch_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number (like menu option)
        System.out.println("Enter a number between 1 to 5:");
        int choice = scanner.nextInt();

        // Switch case to handle different values
        switch (choice) {
            case 1:
                System.out.println("You selected One.");
                break;
            case 2:
                System.out.println("You selected Two.");
                break;
            case 3:
                System.out.println("You selected Three.");
                break;
            case 4:
                System.out.println("You selected Four.");
                break;
            case 5:
                System.out.println("You selected Five.");
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

}
