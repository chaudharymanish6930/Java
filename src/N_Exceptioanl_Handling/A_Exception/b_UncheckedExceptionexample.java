package N_Exceptioanl_Handling.A_Exception;

public class b_UncheckedExceptionexample {
    public static void main(String[] args){
        int x=100;
        int y=0;
        int z=x/y;
        System.out.println(z);
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}