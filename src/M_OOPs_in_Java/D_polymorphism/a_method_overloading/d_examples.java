package M_OOPs_in_Java.D_polymorphism.a_method_overloading;

class Example {
    void display(char ch, int num) {
        System.out.println("Character: " + ch + ", Number: " + num);
    }

    void display(String str, int num) {
        System.out.println("String: " + str + ", Number: " + num);
    }
}

public class d_examples {
    public static void main(String[] args) {
        Example ex = new Example();

        ex.display('A', 100);    // Passing char and int
        ex.display("Hello", 200); // Passing String and int
    }
}
