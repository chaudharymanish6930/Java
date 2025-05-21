package C_Input_From_User;
import java.util.Scanner;
public class e_char {
    public static void main(String[]args){
        Scanner nc=new Scanner(System.in);
        System.out.print("enter a character: "); // manish
        char ch=nc.next().charAt(3);
        System.out.println("you eneterd: "+ch); // i
    }
}
