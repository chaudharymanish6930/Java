package I_Strings.I_Practice;
import java.util.Scanner;

public class a_basics {
    public static void main(String[] args) {
        char[] arr = {'p','r','i','y','a'};
        for(int ch:arr){
//            System.out.println(ch);
        }

        String st="I am Manish choudhary";
//        System.out.println(st);

        // next and nextLine methods in java
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String 1:");
        String s1= sc.next();
        System.out.println(s1);
        System.out.print("Enter the string 2:");
        String s2= sc.nextLine();
        System.out.println(s2);

        System.out.print("Enter the String 1:");
        String s3= sc.nextLine(); // print full
        System.out.println(s3);
        System.out.print("Enter the string 2:");
        String s4= sc.next();  // print only one word
        System.out.println(s4);

    }

    public static class v_lastIndexOf_substring {
        public static void main(String[] args) {
            String text = "This is a simple example.";

            String s=text.substring(text.lastIndexOf(" "));
            System.out.println("The last word is: "+s);
        }
    }
}
