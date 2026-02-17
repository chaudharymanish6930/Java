package I_Strings.C_Methods_of_String;

public class k_compareTo {
    public static void main(String[] args) {
        // lexographically smaller
        String a = "a";
        String b = "aab";
        System.out.println(a.compareTo(b)); // Output: -2
        System.out.println(b.compareTo(a));  // Output: 2

        String str1="Manish";
        String str2="Manesh";  // i-e=in AScii Value
        System.out.println(str1.compareTo(str2));

        String s="Namam";
        System.out.println(s);
        String t="Manish";
        System.out.println(t.compareTo(s));

    }
}