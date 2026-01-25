package I_Strings.B_Char;

public class b_ASCII_value {
    public static void main(String[] args) {
        System.out.println("Capital Letter ASCII value: ");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch + " -> " + (int) ch); // A-65
        }
        System.out.println("Small letter ASCII value: ");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch + " -> " + (int) ch); // a-97
        }
        System.out.println("1-9 number ASCII value: ");
        for (char ch = '0'; ch <= '9'; ch++) {
            System.out.println(ch + " -> " + (int) ch); // 1-48
        }
    }
}