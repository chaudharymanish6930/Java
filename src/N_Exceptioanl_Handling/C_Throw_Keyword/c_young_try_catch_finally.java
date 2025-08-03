package N_Exceptioanl_Handling.C_Throw_Keyword;

class AgeException2 extends RuntimeException{
    AgeException2(String message) {
        super(message);
    }
}
public class c_young_try_catch_finally {
    public static void main(String[] args){
        int age=16;
        try {
            if (age<18){
                throw new AgeException2("not voting");
            }
            else{
                System.out.println("eligible..");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("hello");
        }
        System.out.println("finished.....");
    }
}
