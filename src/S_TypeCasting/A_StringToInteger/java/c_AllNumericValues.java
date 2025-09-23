package S_TypeCasting.A_StringToInteger.java;

public class c_AllNumericValues {
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str);  // throws NumberFormatException if str is not a valid number

        String str1 = "123456789";
        long num1 = Long.parseLong(str1);

        String str2 = "12.34";
        float num2 = Float.parseFloat(str2);

        String str3 = "12.3456";
        double num3 = Double.parseDouble(str3);

        String str4 = "100";
        byte num4 = Byte.parseByte(str4);

        String str5 = "32000";
        short num5 = Short.parseShort(str5);



    }
}
