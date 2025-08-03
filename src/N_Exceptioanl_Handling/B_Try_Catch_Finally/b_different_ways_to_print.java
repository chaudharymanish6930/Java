package N_Exceptioanl_Handling.B_Try_Catch_Finally;

public class b_different_ways_to_print {
    public static void main(String[] args) {
    int a = 100, b = 0;
    try {
        int c = a / b;
    }
    catch(Exception ex) {
        ex.printStackTrace();
        System.out.println(ex.getMessage());
        System.out.println(ex);
        System.out.println(ex.toString());
    }
}
}
