package I_Strings.I_Practice;

public class d_difference {
    public static void main(String[] args) {
        // Declaring string literals
        String str1 = "Java";  // Stored in the String Pool
        String str2 = "JAVA";  // Different value, stored in the String Pool
        String str3 = new String("Java");  // New String but at diffrent memory location

        // Comparing references using '=='
        System.out.println("str1 == str2: " + (str1 == str2));  // false, different content, different references
        System.out.println("str1 == str3: " + (str1 == str3));  // false, str3 is at different memory location
        System.out.println("str2 == str3: " + (str2 == str3));  // false, content is not same
    }
}
