package H_Arrays.A_1D_Array;
import java.util.Scanner;
public class c_size_of_array {
      public static void main(String[] args){
          Scanner a=new Scanner(System.in);
          System.out.println("enter the size of array: ");
          int x=a.nextInt();
          int[] array=new int[x];
          for(int i=0;i<x;i++){
              System.out.print("enter the element "+ i+1+":");
//              Scanner b=new Scanner(System.in);   // not required
               array[i]=a.nextInt();
          }
          System.out.println("the array elements:");
          for(int i=0;i<x;i++){
              System.out.println("Array element "+i+" "+array[i]);
          }
      }
}
