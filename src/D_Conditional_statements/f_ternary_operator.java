package D_Conditional_statements;

public class f_ternary_operator {
    public static void main(String[] args){
        int n=5;
        int result =0;
//
//        if(n%2==0){
//            System.out.println("number is even");
//            result =100;
//        }
//        else{
//            System.out.println("number is odd");
//            result =900;
//        }
//        System.out.println(result);
        result = n%2==0 ? 10 : 20;
        System.out.println(result);
    }
}
