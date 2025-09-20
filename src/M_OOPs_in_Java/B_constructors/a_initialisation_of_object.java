package M_OOPs_in_Java.B_constructors;

public class a_initialisation_of_object {
    String name;
    int age;

    a_initialisation_of_object(String name,int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public static void main(String[]args){
        a_initialisation_of_object st1=new a_initialisation_of_object("Vishal",25);
        a_initialisation_of_object st2=new a_initialisation_of_object("MAnish",20);
        st1.display();
        st2.display();
    }
}
