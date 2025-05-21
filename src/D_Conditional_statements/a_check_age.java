package D_Conditional_statements;
import java.util.*;
public class a_check_age {
    public static void main(String[]args){
        Scanner  a=new Scanner(System.in);
        System.out.print("enter your age: ");
        int age=a.nextInt();
        System.out.println("your entered age: "+age);

        if(age>=18){
            System.out.println("you are eligible");
        }
        else{
            System.out.println("you are not eligible");
        }
    }
}
