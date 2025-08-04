package I_Strings.A_Basics;
import java.util.*;
public class b_input_from_user {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("input a string: ");
        String a=sc.nextLine();
        System.out.println("after entering...");
        System.out.println(a);
    }
}
