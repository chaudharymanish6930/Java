package M_OOPs_in_Java.C_inheritance.A_Basic_Inheritance;

class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
public class b_single_inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // from Animal eats
        d.bark(); // from Dog barks
    }
}

