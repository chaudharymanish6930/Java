package G_Functions;

import java.util.Scanner;

public class g_swaping_function {
    public static void swap(int a, int b){
        int c = a;
        a=b;
        b=c;
        System.out.println("before swaping a ="+a+", b= "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("before swaping a ="+a+", b= "+b);
        swap(a,b);
    }
}
