package E_Loops.A_for_loops;

public class d_nested_loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) { // Outer loop (rows)
            for (int j = 1; j <= 4; j++) { // Inner loop (columns)
                System.out.print("Hello ");
            }
            System.out.println(); // Move to next line after inner loop
        }
    }
}
