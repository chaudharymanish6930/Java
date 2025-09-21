package R_Programs;

import java.util.*;

public class a_fibbonaci {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number: ");
    int n = scanner.nextInt();
    int first =0;
    int second =1;
//    if(n==1){
//        System.out.println("Fibbo of "+n+" :"+first);
//    }
//    else if(n==2){
//        System.out.println("Fibb of "+n+" :"+second);
//    }
//    else if(n>2){
        for(int i=1;i<=n;i++){
            System.out.print(first+" ");
            int next = first+second;
            first = second;
            second = next;
        }
    }
}
