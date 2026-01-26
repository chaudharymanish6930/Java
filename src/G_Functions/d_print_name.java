package G_Functions;
import java.util.Scanner;
public class d_print_name {
    public static void printName(String x){
        System.out.println(x);
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name=a.nextLine();
        printName(name);
    }
}
