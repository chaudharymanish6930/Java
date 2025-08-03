package G_Functions;
import java.util.Scanner;
public class b_sum_of_two_number {
    public static int sum(int a,int b){
        int x=a+b;
        return x;
    }
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        System.out.print("enter a number: ");
        int x=a.nextInt();
        System.out.print("enter another number: ");
        int y=a.nextInt();
        int z=sum(x,y);
        System.out.println("addition: "+z);
    }
}
