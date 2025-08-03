package M_OOPs_in_Java.J_Static_keyword.a_StaticVariable;

public class d_like_loops {
    static int count =0;
    d_like_loops(){
        count++;
        System.out.println(count);
    }
    public static void main(String[] args){
        d_like_loops obj1=new d_like_loops();
        d_like_loops obj2=new d_like_loops();
        d_like_loops obj3=new d_like_loops();
    }
}
