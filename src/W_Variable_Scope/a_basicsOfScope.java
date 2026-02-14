package W_Variable_Scope;

public class a_basicsOfScope {
    public static void main(String[] args) {
        // Main block
        int a = 50; // Accessible throughout the main method

        {
            // Nested block
            int b = 25; // Only accessible within this block
            System.out.println("Inside the block: a = " + a + ", b = " + b);
        }

        System.out.println("Outside the block: a = " + a);
        // System.out.println(b); // Uncommenting this line will cause a compilation error
    }
}
