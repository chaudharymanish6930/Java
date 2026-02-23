package L_Recursion;

import java.util.Scanner;

public class d_GlobalVariable {
    static int x=20; // global
    public static void main(String[] args) {
        System.out.println(x);
        amit(x);
        System.out.println(x);
        int x=100; // local variable
        System.out.println(x);


        System.out.println(y);
    }
    public static void amit(int x){
        x=10;
        System.out.println(x);
    }
//    static int y;
    static Scanner sc = new Scanner(System.in);
    static int y=sc.nextInt();
}
