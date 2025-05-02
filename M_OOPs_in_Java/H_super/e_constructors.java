package M_OOPs_in_Java.H_super;
class C{
    C(){
        System.out.println("in class A");
    }
}
class D extends C{
    D(){
        // by default in it here
        //  super(); used in constructor
        // in class A
        // in class B
        System.out.println("in class B");
    }
}
public class e_constructors  {
    public static void main(String [] args){
    D db=new D();
    }
}
