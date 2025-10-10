package I_Strings.E_String_Comparision;

import java.util.Scanner;

public class d_StringToToken {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            // Write your code here.

            s = s.trim();

            // Edge case: if string is empty after trimming
            if (s.length() == 0) {
                System.out.println(0);
                return;
            }

            String[] token = s.split("[^A-Za-z]+");
            System.out.println(token.length);

            for(String tokens : token){
                System.out.println(tokens);
            }
            scan.close();
        }
    }