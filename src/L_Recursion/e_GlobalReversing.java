package L_Recursion;
import java.util.Scanner;
public class e_GlobalReversing {
    static int x;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        amit(x);
    }
    public static void amit(int x){
        if(x==0) return;
        System.out.print (x);
        amit(x-1);
        System.out.print(x+" ");
    }
}
