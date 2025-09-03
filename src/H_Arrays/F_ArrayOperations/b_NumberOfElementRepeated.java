package H_Arrays.F_ArrayOperations;

import java.util.Scanner;

public class b_NumberOfElementRepeated {
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

        // how many times the element are comes
        System.out.print("Enter the finding element: ");
        int target = scanner.nextInt();

        int count =0;
        for(int i=0; i<n; i++){
            if(target == arr[i]){
                count++;
            }
        }
        System.out.println(target+" element comes times: "+count);
    }
}
