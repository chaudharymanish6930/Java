package H_Arrays.F_ArrayOperations;

import java.util.Scanner;

public class c_ArraySorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // size of array
        System.out.print("enter the size of array: ");
        int n = scanner.nextInt();
        // create an array
        int[] arr = new int[n];

        System.out.println("Enter the values: ");
        for(int i =0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        // print the array elements
        System.out.print("values of array:");
        for(int i =0;i<n; i++){
            System.out.print(+arr[i]+" ");
        }

        boolean flag = true;
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println("it is sorted");
        }
        else{
            System.out.println("not sorted");
        }
    }
}
