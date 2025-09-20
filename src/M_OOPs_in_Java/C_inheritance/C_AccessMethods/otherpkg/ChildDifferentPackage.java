package M_OOPs_in_Java.C_inheritance.C_AccessMethods.otherpkg;

import M_OOPs_in_Java.C_inheritance.C_AccessMethods.mypkg.Parent;

public class ChildDifferentPackage extends Parent {
    public ChildDifferentPackage() {
        super();
        System.out.println("ChildDifferentPackage constructor");
    }

    public void accessMethods() {
        System.out.println("--- Accessing from ChildDifferentPackage (different package) ---");

        publicMethod();        // OK: public is accessible
        protectedMethod();     // OK: protected is accessible in a subclass even from another package
        // defaultMethod();    // ERROR if uncommented: default (package-private) NOT accessible outside package
        // privateMethod();    // ERROR if uncommented: private not accessible

        callPrivate();         // OK: indirect access to private via public wrapper

        // Important note: With a Parent instance in a different package you CANNOT call protected:
        Parent p = new Parent();
//         p.protectedMethod(); // ERROR if uncommented: can't access protected on a Parent instance from another package
    }

    public static void main(String[] args) {
        ChildDifferentPackage child = new ChildDifferentPackage();
        child.accessMethods();
    }
}
