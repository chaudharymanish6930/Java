package M_OOPs_in_Java.C_inheritance;
class aaa{
    void showA(){
        System.out.println("method in a");
    }
}
class bbb extends aaa{
    void showB(){
        System.out.println("method in b");
    }
}
class ccc extends aaa{
    void showC(){
        System.out.println("method in c");
    }
}
public class f_hierarchical_inheritance {
    public static void main(String[] args){
        aaa obj1=new aaa();
        obj1.showA();
//        obj1.showB(); shows error
//        obj1.showC(); shows error

        bbb obj2=new bbb();
        obj2.showA();
        obj2.showB();
//        obj1.showC(); shows error

        ccc obj3=new ccc();
        obj3.showC();
        obj3.showA();
//        obj3.showB();  shows error
    }
}
