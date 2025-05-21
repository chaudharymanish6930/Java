package M_OOPs_in_Java.H_super;

class A{
    void m1(){
        System.out.println("I am in class A");
    }
}
class B extends A{
    void m1(){
        System.out.println("I am in class B");
    }
    void show(){
        m1();  //  class B
        super.m1(); // class A
    }
}
public class d_two_methods_in_class {
    public static void main(String [] args){
        B ab=new B();
        ab.show();
    }
}
