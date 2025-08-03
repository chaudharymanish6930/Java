package M_OOPs_in_Java.A_class_object_methods.Object_initialisation;

public class b_another_by_reference {
    String name;
    int age;

    public static void main(String[]args){
        System.out.println("hello...");
        b_another_by_reference ab=new b_another_by_reference();
        ab.name="MAnish";
        ab.age=57;
        System.out.println("name"+" "+ab.name+" "+"age"+" "+ab.age);
    }
}
