package N_Exceptioanl_Handling.B_Try_Catch_Finally;

public class c_finally_block {
    public static void main(String[] args) {
        int a = 100, b = 0;
        try {
            int c = a / b;
        }
        catch(Exception ex) {
            System.out.println(ex);
        }
        finally {
            System.out.println("in finally");
        }
    }
}
