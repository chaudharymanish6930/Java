package L_Recursion;

import java.util.Scanner;

public class g_Increasing_Decreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        print(x);
    }
    public static void print(int x){
        if(x==0) return; // two time one's printed
        if(x==1){ // one one time one is printed
            System.out.println(x);
            return;
        }
        System.out.println(x);
        print(x-1);
        System.out.println(x);
    }
}
