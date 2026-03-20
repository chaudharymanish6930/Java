package M_OOPs_in_Java.K_ReferencePasses;

public class a_basics {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Alice";

        Person p2 = p1;
        p2.name = "Bob";
        System.out.println(p1.name);
    }
}
class Person {
    String name;
}
