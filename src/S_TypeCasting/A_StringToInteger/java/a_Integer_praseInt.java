package S_TypeCasting.A_StringToInteger.java;

public class a_Integer_praseInt {
    public static void main(String[] args) {
        String str = "123";        // String containing a number
        int num = Integer.parseInt(str);  // Convert String → int

        System.out.println("String: " + str);
        System.out.println("Integer: " + num);
    }
}
