package R_Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class j_PrintAllPrimeNumber {
    public static int[] CountPrime(int num){
        if(num==0) return new int[0];
        ArrayList arr= new ArrayList();
        for(int i=1; i<=num; i++){
            int count=0;
            for(int j=1; j<=num; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if(count==2){
                arr.add(i);
            }
        }
        int[] ans= new int[arr.size()];
        for(int i=0; i<ans.length; i++){
            ans[i]=(int)arr.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        j_PrintAllPrimeNumber obj=new j_PrintAllPrimeNumber();
        int[] arr =obj.CountPrime(n);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
