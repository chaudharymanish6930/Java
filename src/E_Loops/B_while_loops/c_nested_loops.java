package E_Loops.B_while_loops;

public class c_nested_loops {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 4) {  // Outer loop runs 3 times
            int j = 1;

            while (j <= 3) {  // Inner loop runs 2 times for each outer loop
                  System.out.println(i+" Hello "+j);
                j++;
            }

            i++;
        }
    }
}
