package C_Input_From_User;
import java.util.Scanner;
public class f_boolean {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter true or false: ");  // true
        boolean bool = sc.nextBoolean();
        System.out.println("You entered: " + bool); // true
    }
}
