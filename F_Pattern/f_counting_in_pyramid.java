package F_Pattern;

import java.util.Scanner;

public class f_counting_in_pyramid {
    public static void main(String[]args){
    Scanner a=new Scanner(System.in);
    System.out.print("enter the length :");
    int x=a.nextInt();
    int number=1;

    for(int i=1;i<=x;i++){
        for(int j=1;j<=i;j++){
            System.out.print(number);
            number++;
        }
        System.out.println();
    }
}
}
