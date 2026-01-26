package F_Pattern;

import java.util.Scanner;

public class g_square_stars {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("enter the length :");
        int x=a.nextInt();

        for(int i=1;i<=x;i++){
            for(int j=1;j<=x;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
