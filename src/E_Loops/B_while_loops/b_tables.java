package E_Loops.B_while_loops;
import java.util.Scanner;
public class b_tables {
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter a number: ");
        int n=a.nextInt();

        int i=1;
        while(i<=10){
            System.out.println(n+"*"+i+"="+i*n);
            i++;
        }
    }
}
