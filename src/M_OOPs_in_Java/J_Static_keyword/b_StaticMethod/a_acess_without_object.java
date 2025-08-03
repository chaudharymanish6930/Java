package M_OOPs_in_Java.J_Static_keyword.b_StaticMethod;

public class a_acess_without_object {
    static void show(){
        System.out.println("without object");
    }
    void display(){
        System.out.println("with object");
    }
    public static void main(String[] args){
        a_acess_without_object obj1=new a_acess_without_object();
        obj1.display();  // with object
        show();   // without object
        a_acess_without_object.show(); // without object

    }
}
