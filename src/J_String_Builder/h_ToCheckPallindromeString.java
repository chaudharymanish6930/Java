package J_String_Builder;

import java.util.Scanner;

public class h_ToCheckPallindromeString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reversed = new StringBuilder(A).reverse().toString();

        if(A.equals(reversed)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
