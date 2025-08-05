package M_OOPs_in_Java.C_inheritance.A_Basic_Inheritance;

class aa{
    void showA(){
        System.out.println("a is method");
    }
}
class bb extends a {
    void showB(){
        System.out.println("b is method");
    }
}
class cc extends b {
    void showC(){
        System.out.println("c is method");
    }
}
public class e_multi_level2 {
    public static void  main(String[] args){
      aa obj1=new aa();
//        obj1.showC();  shows error
//        obj1.showB();  shows error
        obj1.showA();
      bb obj2=new bb();
//        obj2.showC();   show error
        obj2.showB();
        obj2.showA();
      cc obj3=new cc();
      obj3.showC();
      obj3.showB();
      obj3.showA();
    }
}
