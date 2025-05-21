package F_Pattern;

import java.util.Scanner;

public class d_inverted_half_pyramid {
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        System.out.print("enter the length :");
        int x=a.nextInt();

        for(int i=x;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
