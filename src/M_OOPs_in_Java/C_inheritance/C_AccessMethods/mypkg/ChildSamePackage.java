package M_OOPs_in_Java.C_inheritance.C_AccessMethods.mypkg;

public class ChildSamePackage extends Parent {
    public ChildSamePackage() {
        super();
        System.out.println("ChildSamePackage constructor");
    }

    public void accessMethods() {
        System.out.println("--- Accessing from ChildSamePackage (same package) ---");

        publicMethod();        // OK: public everywhere
        protectedMethod();     // OK: protected is accessible here (same package + subclass)
        defaultMethod();       // OK: default (package-private) accessible in same package
        // privateMethod();    // ERROR if uncommented: privateMethod() is private in Parent
        callPrivate();         // OK: indirect access via Parent's public wrapper
    }

    public static void main(String[] args) {
        ChildSamePackage child = new ChildSamePackage();
        child.accessMethods();
    }
}
