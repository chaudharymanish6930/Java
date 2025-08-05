package M_OOPs_in_Java.A_class_object_methods.Object_creating;

class Ab{
    public Ab(){
        System.out.println("in Ab constructor");
    }
    public void show(){
        System.out.println("in show method");
    }
}
public class c_anonymous_object {
    public static void main(String[]  args){
        // Anonymous object
        new Ab();

        new Ab().show();

    }
}
