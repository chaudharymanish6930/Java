package G_Functions;

import java.util.Scanner;

public class c_multiple_of_two_number {
    public static int sum(int a,int b){
        return a*b;
    }
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        System.out.print("enter first number:");
        int x=a.nextInt();
        System.out.print("enter second number");
        int y=a.nextInt();
        int z=sum(x,y);
        System.out.println("multiply:"+z);
    }
}
