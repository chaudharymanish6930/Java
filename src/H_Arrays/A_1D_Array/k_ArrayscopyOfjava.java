package H_Arrays.A_1D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class k_ArrayscopyOfjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of arrray: ");
        int len = sc.nextInt();
        int[] arr = new int[len];

        System.out.println("enter element in array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element "+i+" :");
            arr[i] = sc.nextInt();
        }

        System.out.println("Your Array Elements:");
        for(int num: arr){
            System.out.print(num+" ");
        }

        int[] deep = Arrays.copyOf(arr, arr.length);
        deep[0] =100;
        System.out.println(arr[0]);
        System.out.println(deep[0]);
    }
}
