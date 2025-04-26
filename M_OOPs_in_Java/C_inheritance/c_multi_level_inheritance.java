//package M_OOPs_in_Java.C_inheritance;
class Animal1 {
    void eat() {
        System.out.println("Animal eats");
    }
}
class Dog extends Animal1  {
    void bark() {
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}
public class c_multi_level_inheritance {
        public static void main(String[] args) {
            Puppy p = new Puppy();
            Animal1 dog= new Animal1();
            p.eat();   // from Animal eats
            p.bark();  // from Dog barks
            p.weep();  // from Puppy weeps
        }

}

