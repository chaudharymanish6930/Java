package F_Pattern;
import java.util.Scanner;
public class e_half_pyramid_in_no {
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        System.out.print("enter the length :");
        int x=a.nextInt();

        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
