package M_OOPs_in_Java.D_polymorphism.a_method_overloading;
class Display {
    void show(int a, String b) {
        System.out.println("Integer: " + a + ", String: " + b);
    }

    void show(String a, int b) {
        System.out.println("String: " + a + ", Integer: " + b);
    }
}
public class b_sequence_of_arguments {
    public static void main(String[] args) {
        Display d = new Display();
        d.show(100, "Hello"); // Output: Integer: 100, String: Hello
        d.show("World", 200); // Output: String: World, Integer: 200
    }
}
