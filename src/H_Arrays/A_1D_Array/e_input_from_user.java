package H_Arrays.A_1D_Array;
import java.util.Scanner;
public class e_input_from_user {
    public static void main(String []args){
    Scanner a=new Scanner(System.in);
        System.out.print("enter the lenght of array: ");
        int n=a.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=a.nextInt();
        }
        System.out.println("print array element: ");
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
    }
}
