package R_Programs;

import java.util.Scanner;

public class i_FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int product =1;
        for(int i=1; i<=N; i++){
            product = product*i;
        }
        System.out.println(product);
    }
}
