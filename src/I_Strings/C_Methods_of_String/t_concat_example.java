package I_Strings.C_Methods_of_String;

public class t_concat_example {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = " World";
        String result = str1.concat(str2);
        System.out.println(result); // Output: Hello World

        String str3 = str1.concat(" bob ").concat(str1);
        System.out.println(str3);
    }
}
