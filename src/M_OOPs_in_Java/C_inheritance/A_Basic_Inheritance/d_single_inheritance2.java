package M_OOPs_in_Java.C_inheritance.A_Basic_Inheritance;

class a{
    void showA(){
        System.out.println("a is show");
    }
}
class b extends a{
    void showB(){
        System.out.println("b is show");
    }
}

public class d_single_inheritance2 {
    public static void main(String[] args){
    // object of a class
        a obj1=new a();
//      obj1.showB();  show error
        obj1.showA();
    // object of b class
        b obj2=new b();
        obj2.showA();
        obj2.showB();
    }
}
