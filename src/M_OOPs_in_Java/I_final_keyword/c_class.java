package M_OOPs_in_Java.I_final_keyword;

final public class c_class  {
    void run() {
        System.out.println("i am in top");
    }


//    class Car extends c_class {  ❌ Error: Cannot inherit from final class
//    }
    public static void main(String[] args) {
        c_class c=new c_class();
        c.run();
    }
}
