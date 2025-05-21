package M_OOPs_in_Java.E_abstraction;
interface I1{
    // by default keywords are added in it...
    public abstract void show();
    // for variable declared
    public static final int a=10;
}
class I2 implements I1{
    public void show(){
        System.out.println("default...");
    }
}

public class f_by_Default_interface {
    public static void main(String[] args){
        I1 i=new I2();
        i.show();
    }
}
