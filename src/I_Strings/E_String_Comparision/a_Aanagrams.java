package I_Strings.E_String_Comparision;

import java.util.Scanner;

public class a_Aanagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        // Convert strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // If lengths are different, they can't be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Create array to store character frequencies (for 26 lowercase letters)
        int[] freq = new int[26];

        // Count frequencies for string a and decrement for string b
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;
        }

        // If all frequencies are 0, strings are anagrams
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
