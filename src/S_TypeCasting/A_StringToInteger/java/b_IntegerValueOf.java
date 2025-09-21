package S_TypeCasting.A_StringToInteger.java;

public class b_IntegerValueOf {
    public static void main(String[] args) {
        String str = "456";
        Integer numObj = Integer.valueOf(str); // Returns Integer object

        System.out.println("String: " + str);
        System.out.println("Integer Object: " + numObj);

        // Auto-unboxing to primitive int
        int num = numObj;
        System.out.println("Primitive int: " + num);
    }
}
