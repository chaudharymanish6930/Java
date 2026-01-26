package H_Arrays.A_1D_Array;

import java.util.Scanner;

public class g_Maximum_number {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("enter the lenght of array: ");
        int n=a.nextInt();
        int[] num=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter element "+i+":");
            num[i]=a.nextInt();
        }
        int max=num[0];
        for(int i=0; i<num.length; i++){
            if(num[i]>max){
                max= num[i];
            }
        }
        System.out.println(max);
    }
}
