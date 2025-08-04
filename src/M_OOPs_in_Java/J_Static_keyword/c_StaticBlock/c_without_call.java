package M_OOPs_in_Java.J_Static_keyword.c_StaticBlock;

class mystatic{
    static {
        System.out.println("hello u are in static block..");
    }
}
public class c_without_call {
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("M_OOPs_in_Java.J_Static_keyword.c_StaticBlock.mystatic");
    }

}
