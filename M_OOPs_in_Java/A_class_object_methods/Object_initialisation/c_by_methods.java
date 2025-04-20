package M_OOPs_in_Java.A_class_object_methods.Object_initialisation;

public class c_by_methods {
    String  name;
    int age;

    void intiobject(String c,int d){
        name=c;
        age=d;
    }
    void display(){
        System.out.println("name"+" "+name+" "+"age"+" "+age);
    }
    public static void main(String[] args){
    c_by_methods ab=new c_by_methods();
    ab.intiobject("manish",20);
    ab.display();
    }

}
