package M_OOPs_in_Java.E_abstraction;

// Interface 1
interface Flyable {
    void fly();
}

// Interface 2
interface Swimmable {
    void swim();
}

// Class implements both interfaces (Multiple Inheritance)
class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck is flying.");
    }

    public void swim() {
        System.out.println("Duck is swimming.");
    }
}
public class e_multiple_inheritance {
    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();   // Output: Duck is flying.
        d.swim();  // Output: Duck is swimming.
    }
}
