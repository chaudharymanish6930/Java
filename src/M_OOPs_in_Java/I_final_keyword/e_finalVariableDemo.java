package M_OOPs_in_Java.I_final_keyword;

public class e_finalVariableDemo {
    public static void main(String[] args) {
        final int number = 10;
        System.out.println("Final variable: " + number);

        // number = 20;  // ❌ Error: Cannot assign a value to final variable
    }
}
