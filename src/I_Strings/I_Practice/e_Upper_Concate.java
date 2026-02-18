package I_Strings.I_Practice;

public class e_Upper_Concate {
    public static void main(String[] args) {

            String s1="Hello";
            String s2="World";

            // Converting both strings to uppercase

            String s3 = s1.toUpperCase().concat(" ").concat(s2.toUpperCase());
            System.out.println(s3.length());
            System.out.println(s3);
        }
}
