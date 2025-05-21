package M_OOPs_in_Java.A_class_object_methods.Object_initialisation;
class car{
    // by reference variables...
    String company;
    String model;
    int age;
}
public class a_by_reference_variable {
    public static void main(String[] args){
    car car1=new car();
    car1.company="nisssan";
    car1.model="2015";
    car1.age=12;

        System.out.println(car1.company+" "+car1.model+" "+car1.age);
    }
}
