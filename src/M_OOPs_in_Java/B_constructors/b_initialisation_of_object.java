package M_OOPs_in_Java.B_constructors;
class employee {
    String name;
    int age;
    // constructors
    employee(String name,int age){
        this.name=name;
        this.age=age;
    }

    void display() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class b_initialisation_of_object {
    public static void main(String[]args){
        employee st1=new employee("Vishal",25);
        employee st2=new employee("MAnish",20);
        st1.display();
        st2.display();
    }
}
