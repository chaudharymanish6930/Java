package M_OOPs_in_Java.A_class_object_methods.Object_creating;
// class
class pen{
    String color;
    String type;

    public void write(){
        System.out.println("hello");
    }
}

public class a_basics {
    public static void main(String[]args){
        System.out.println("1");
        //create objects
        pen p1=new pen();
        p1.write();
    }
}

