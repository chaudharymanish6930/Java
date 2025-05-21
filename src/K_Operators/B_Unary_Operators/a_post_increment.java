package K_Operators.B_Unary_Operators;

public class a_post_increment {
    public static void main(String[]args){
        int a=10;
        int b=0;

        b=a++;
        System.out.println(a); // 11
        System.out.println(b); // 10
    }
}
