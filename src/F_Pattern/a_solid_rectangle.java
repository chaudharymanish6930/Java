package F_Pattern;
import java.util.Scanner;
public class a_solid_rectangle {
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        System.out.print("enter the length :");
        int x=a.nextInt();

        Scanner b=new Scanner(System.in);
        System.out.print("enter the breadth :");
        int y=a.nextInt();

        for(int i=1;i<=x;i++){
            for(int j=1;j<=y;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
