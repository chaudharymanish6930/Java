package M_OOPs_in_Java.D_polymorphism.b_method_overriding;
class Test{
    void show1(int a){
        System.out.println(a);
    }
}
class Xyz extends Test{
    void show1(int b){
        System.out.println(b);
    }
}
public class a_overriding {
    public static void main(String [] args){
        Test t=new Test();
        t.show1(10);

        Xyz x=new Xyz();
        x.show1(20);
    }
}
