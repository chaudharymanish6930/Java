package H_Arrays.A_1D_Array;

import java.util.Scanner;

public class d_find_the_element {
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int x=a.nextInt();
        int[] array=new int[x];

        for(int i=0;i<x;i++){
            System.out.print("enter the element "+(i+1)+":");
//              Scanner b=new Scanner(System.in);   // not required
            array[i]=a.nextInt();
        }
        System.out.println("enter the find element: ");
        int n=a.nextInt();

        System.out.println("the array elements:");
        for(int i=0;i<x;i++){
            System.out.println("Array element "+i+" "+array[i]);
        }

        System.out.println("search element: ");
        for(int i=0;i<x;i++){
            if (n==array[i]){
                System.out.println("element found at: "+i+1+"is"+array[i]);
            }

        }

    }
}
