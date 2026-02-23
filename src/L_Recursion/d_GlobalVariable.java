package L_Recursion;

public class d_GlobalVariable {
    static int x=20;
    public static void main(String[] args) {
        System.out.println(x);
        amit(x);
        System.out.println(x);
    }
    public static void amit(int x){
        x=10;
        System.out.println(x);
    }
}
