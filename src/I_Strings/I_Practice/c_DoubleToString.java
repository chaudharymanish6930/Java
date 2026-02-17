package I_Strings.I_Practice;

import java.util.Scanner;

public class c_DoubleToString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double d=sc.nextDouble();

        String s =""+ d;
        System.out.println(s);

        System.out.println(s.length());
    }
}
