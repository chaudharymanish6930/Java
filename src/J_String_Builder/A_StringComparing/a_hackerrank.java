package J_String_Builder.A_StringComparing;

import java.util.Scanner;

public class a_hackerrank {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int length = A.length() + B.length();
        System.out.println(length);

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        System.out.println(A.substring(0,1).toUpperCase()+ A.substring(1)+ " "+B.substring(0,1).toUpperCase()+B.substring(1));

    }
}
