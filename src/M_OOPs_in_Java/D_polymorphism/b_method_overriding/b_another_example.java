package M_OOPs_in_Java.D_polymorphism.b_method_overriding;

class A{
    public int add(int a, int b){
        return a+b;
    }
}
class B extends A{
    public int add(int a, int b){
        return a+b+2;
    }
}

public class b_another_example {
    public static void main(String[] args){
        B r1 = new B();
        int value=r1.add(12,8);

        // child class priority first...  thus overriding the parent methods
        System.out.println(value);
    }
}
