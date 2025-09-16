package M_OOPs_in_Java.C_inheritance.C_AccessMethods.mypkg;

public class Parent {
    public Parent() {
        System.out.println("Parent constructor");
    }

    // public method: accessible from anywhere
    public void publicMethod() {
        System.out.println("Public method");
    }

    // protected method: accessible in same package and in subclasses (also in different packages via inheritance)
    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    // default (package-private) method: no modifier -> accessible only inside the same package
    void defaultMethod() {
        System.out.println("Default (package-private) method");
    }

    // private method: accessible only inside this class (Parent)
    private void privateMethod() {
        System.out.println("Private method");
    }

    // public wrapper that calls privateMethod() - allows controlled/indirect access
    public void callPrivate() {
        System.out.println("callPrivate() in Parent calling privateMethod():");
        privateMethod();
    }
}
