package M_OOPs_in_Java.E_abstraction;
// Interface
interface Payment {
    void pay(double amount);
    // not concrete class allowed in it
}

// Class 1 implements the interface
class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

// Class 2 implements the interface
class PayPalPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}
public class c_interface {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        Payment p2 = new PayPalPayment();

        p1.pay(250.75);  // Output: Paid $250.75 using Credit Card.
        p2.pay(100.00);
    }
}
