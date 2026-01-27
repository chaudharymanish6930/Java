package I_Strings.E_StringBuilder;

import java.util.Scanner;

public class b_reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        // Reverse of the string
        StringBuilder st = new StringBuilder();
        for(int i=str.length()-1; i>=0; i--){
            st.append(str.charAt(i));
        }
        System.out.println(st.toString());
    }
}
