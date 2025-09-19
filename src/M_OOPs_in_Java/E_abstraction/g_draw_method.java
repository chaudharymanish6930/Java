package M_OOPs_in_Java.E_abstraction;

abstract class Shapes {
    String color;

    // Constructor of abstract class
    Shapes(String color) {
        this.color = color;
        System.out.println("Shape constructor called for " + color);
    }

    // Abstract method
    abstract void draw();
}

class Circles extends Shapes {
    int radius;

    Circles(String color, int radius) {
        super(color);   // Calls Shape constructor
        this.radius = radius;
        System.out.println("Circle constructor called");
    }

    @Override
    void draw() {
        System.out.println("Drawing " + color + " circle with radius " + radius);
    }
}

public class g_draw_method {
    public static void main(String[] args) {
        // Shapes s = new Shapes("Red");  //Error: Cannot instantiate abstract class
        Circles c = new Circles("Blue", 10);  // Shape constructor will run first
        c.draw();
    }
}
