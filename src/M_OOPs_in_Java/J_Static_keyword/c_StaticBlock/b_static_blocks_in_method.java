package M_OOPs_in_Java.J_Static_keyword.c_StaticBlock;

class MyClass {
    static {
        System.out.println("Static block of MyClass");
    }

    public MyClass() {
        System.out.println("Constructor of MyClass");
    }
}

public class b_static_blocks_in_method {
    public static void main(String[] args) {
        System.out.println("Main method started");

        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
    }
}
