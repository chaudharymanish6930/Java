package I_Strings.E_String_Comparision;

import java.util.Scanner;

public class c_StringIntoTokens {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String str = s.nextLine();

        String[] token = str.split(" ");

        for(String ss : token){
            System.out.println(ss);
        }
    }
}
