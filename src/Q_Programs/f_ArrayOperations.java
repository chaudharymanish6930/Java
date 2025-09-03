package Q_Programs;

import java.util.Scanner;

public class f_ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // size of array
        int n = scanner.nextInt();
        // create an array
        int[] arr = new int[n];

        System.out.print("Enter the values: ");
        for(int i =0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        // print the array elements
        for(int i =0;i<n; i++){
            System.out.print(arr[i]);
        }

        // sum of all elements of array
        int sum =0;
        for(int i=0; i<n; i++){
            sum +=arr[i];
        }
        System.out.println("sum of arrays: "+sum);

        // now largest and smallest element fron the array
        int max =arr[0];
        int min = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Maximum number: "+max);
        System.out.println("Minimum number: "+min);
    }
}
