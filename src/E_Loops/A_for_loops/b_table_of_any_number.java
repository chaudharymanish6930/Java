package A_for_loops;
import java.util.Scanner;
public class b_table_of_any_number {
    public static void main(String[]args){

        Scanner a=new Scanner(System.in);

        System.out.println("enter the number: ");
        int n=a.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
    }
}
