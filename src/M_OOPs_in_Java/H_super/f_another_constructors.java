package M_OOPs_in_Java.H_super;

class Aa{
    public Aa(){
        super();  // by default
        System.out.println("in constructor of Aa");
    }
    public Aa(int a){
        super();  // by default
        System.out.println("in paramerter constructor of Aa");
    }
}

class Bb extends Aa{
    public Bb(){
        super();  // by default
        System.out.println("in default constructor of Bb");
    }
    public Bb(int a){
        super();  // by default
        System.out.println("in paramerter constructor of Bb");
    }
}
public class f_another_constructors {
    public static void main(String[] args){
        Bb obj = new Bb(4);
    }
}
