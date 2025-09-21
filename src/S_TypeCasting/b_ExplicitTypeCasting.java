package S_TypeCasting;

public class b_ExplicitTypeCasting {
    public static void main(String[] args) {
        double d = 123.456;
//        float f =d;
//        long l= f;   lossy conversion
        int i = (int) d;      // double → int
        byte b = (byte) i;    // int → byte

        System.out.println("double value: " + d);
        System.out.println("int value: " + i);  // fractional part lost
        System.out.println("byte value: " + b); // overflow possible
    }
}
