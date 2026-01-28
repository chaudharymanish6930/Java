package H_Arrays.B_2D_Array;

import java.util.Scanner;

public class b_input_from_user {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.print("enter size of rows: ");
        int x=a.nextInt();
        System.out.print("enter size of colunms: ");
        int y=a.nextInt();

        int[][] array=new int[x][y];

        System.out.println("enter the values: ");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print("entered value of:");
                array[i][j]=a.nextInt();
            }
        }

        System.out.println("the array elements:");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
