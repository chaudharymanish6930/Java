package C_do_while_loops;
import java.util.Scanner;
public class b_tables {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = a.nextInt();

        int i = 0;
        do {
            System.out.println(n+"*"+i+"="+n*i);
            i++;
        } // terminator is important
        while (i <= 10);
//        {
//            System.out.println();
//        }        // it is not required in do while loops  because only check the condition
    }

}
