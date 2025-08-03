package N_Exceptioanl_Handling.B_Try_Catch_Finally;

public class a_try_catch {
    public static void main(String[] args){
        int a=100;
        int b=0;
        try{
            int c=a/b;
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
