package M_OOPs_in_Java.H_super;

public class a_basics {
    int i=10;
}
class Variable extends a_basics{
    int i=20;
    void display(int i){
        System.out.println(i);   // 30
        System.out.println(this.i);  // 20
        System.out.println(super.i);  // 10
    }
    public static void main(String[] args){
        Variable vb=new Variable();
        vb.display(30);
    }
}
