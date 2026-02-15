package W_Variable_Scope;

public class b_BankManagement {
    public static void main(String[] args) {
        int accountNumber = 12345;
        {
            int pin = 6789;
            System.out.println("PIN Verified: " + pin);
            System.out.println("acoount Number: "+accountNumber);
        }
//        System.out.println(pin); error
        int m=2/3;
        System.out.println(m);
    }
}
