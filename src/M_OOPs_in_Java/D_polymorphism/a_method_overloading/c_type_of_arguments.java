package M_OOPs_in_Java.D_polymorphism.a_method_overloading;
class Demo {
    void show(int a, int b) {
        System.out.println("Two integers: " + (a + b));
    }

    void show(double a, double b) {
        System.out.println("Two doubles: " + (a + b));
    }
}
public class c_type_of_arguments {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show(5, 10);      // Output: Two integers: 15
        d.show(5.5, 10.5);  // Output: Two doubles: 16.0
    }
}
