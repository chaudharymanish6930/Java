package H_Arrays.D_3D_Array;
import java.util.Random;

public class a_declarations_array {
    public static void main(String[] args) {
        int depth = 3;   // number of 2D layers
        int rows = 3;    // number of rows
        int cols = 4;    // number of columns

        // the output the layer is equals to depth

        int[][][] array = new int[depth][rows][cols];
        Random rand = new Random();

        // Fill the 3D array with random values between 1 and 100
        for (int i = 0; i < depth; i++) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    array[i][j][k] = rand.nextInt(100) + 1; // 1 to 100
                }
            }
        }

        // Print the 3D array
        for (int i = 0; i < depth; i++) {
            System.out.println("Layer " + (i + 1) + ":");
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    System.out.print(array[i][j][k] + "\t");
                }
                System.out.println(); // New line after each row
            }
            System.out.println(); // Space between layers
        }
    }
}