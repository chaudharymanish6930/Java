package D_Conditional_statements;
import java.util.Scanner;
public class c_grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student marks
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

        // Determine grade using if-else conditions
        String grade;
        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else if (marks >= 50) {
            grade = "D";
        } else {
            grade = "F (Fail)";
        }

        // Print the grade
        System.out.println("Your Grade: " + grade);

        scanner.close();
    }

}
