package M_OOPs_in_Java.K_ReferencePasses;

public class Test {
    static void change(Person p) {
        p = new Person();   // new reference
        p.name = "Bob";
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Alice";

        change(p1);
        System.out.println(p1.name); // ?
    }
}
