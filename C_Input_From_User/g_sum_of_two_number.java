package C_Input_From_User;
import java.util.Scanner;
public class g_sum_of_two_number {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num1=a.nextInt();
        Scanner b=new Scanner(System.in);
        System.out.print("enter another number: ");
        int num2=b.nextInt();
        System.out.print("sum of two number: "+num1+num2);
    }
}
