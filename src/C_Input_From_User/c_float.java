package C_Input_From_User;
import java.util.Scanner;

public class c_float {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a float: ");
        float num = sc.nextFloat();
        System.out.println("You entered: " + num);
    }
}
