package A_Basics;

import java.util.Scanner;

public class i_SecondLargestElement {
    public static int secondLargest(int[] arr){
        if(arr.length<2) return -1;

        int l = Integer.MIN_VALUE;
        int sl = Integer.MIN_VALUE;

        for(int i: arr){
            if(i>l){
                sl = l;
                l=i;
            }
            else if(i>sl && l!=i){
                sl = i;
            }
        }
        return (sl==Integer.MIN_VALUE)? -1 : sl;
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

        System.out.println("\nSecond Largest element: "+secondLargest(arr));

    }
}
