package M_OOPs_in_Java.D_polymorphism.a_method_overloading;

class MathOperations {
    void multiply(int a, int b) {
        System.out.println("Result (2 numbers): " + (a * b));
    }

    void multiply(int a, int b, int c) {
        System.out.println("Result (3 numbers): " + (a * b * c));
    }
}

public class a_no_of_arguments {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        math.multiply(2, 3);      // Output:
        math.multiply(2, 3, 4);   // Output: 24
    }

}
