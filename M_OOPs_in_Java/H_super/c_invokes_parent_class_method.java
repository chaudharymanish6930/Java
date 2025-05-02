package M_OOPs_in_Java.H_super;

public class c_invokes_parent_class_method {
    void m1(){
        System.out.println("i am in m1");
    }
}
class Variable2 extends c_invokes_parent_class_method{
    void show(){
        super.m1();
    }
    public static void main(String [] args){
        Variable2 vb=new Variable2();
        vb.show();
    }
}
