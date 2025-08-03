package M_OOPs_in_Java.C_inheritance;

public class a_basics {
    void eat(){
        System.out.println("i am eating");
    }
}
class basics extends a_basics{
    public static void main(String[] args){
        System.out.println("hello");
        basics aa=new basics();
//        aa.eat();  shows error without extends
        aa.eat();
    }
}
