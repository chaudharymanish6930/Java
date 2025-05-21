package M_OOPs_in_Java.E_abstraction;

abstract class Shape {
    // Abstract method (no body)
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("Displaying shape...");
    }
}

// Subclass 1
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Subclass 2
class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}


public class b_abstract_class2 {
    public static void main(String[] args) {
        // reference of the abstract class name
        Shape s1 = new Circle();     // Upcasting
        Shape s2 = new Rectangle();  // Upcasting

        s1.draw();    // Output: Drawing a Circle.
        s2.draw();    // Output: Drawing a Rectangle.

        s1.display(); // Output: Displaying shape...
    }
}
