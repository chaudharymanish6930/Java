package A_Basics;

import java.util.Scanner;

public class j_multiply_odd_add_even {
    public static void OddEven(int[] arr){
        for(int i=0; i<=arr.length-1; i++){
            if(i%2==0){
                arr[i] = arr[i]+10;
            }
            else{
                arr[i] = arr[i]*2;
            }
        }

        System.out.println("Your Array Elements:");
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
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
        OddEven(arr);
    }
}
