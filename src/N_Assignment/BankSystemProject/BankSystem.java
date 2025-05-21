package N_Assignment.BankSystemProject;

public class BankSystem {
    public static void main(String[] args) {
        // Savings Account test
        SavingsAccount savings = new SavingsAccount(101, 5000, 5);
        savings.showBalance();
        savings.deposit(1000);
        savings.applyInterest();
        savings.withdraw(2000);
        savings.showBalance();

        System.out.println("---------------------");

        // Current Account test
        CurrentAccount current = new CurrentAccount(102, 2000, 1000);
        current.showBalance();
        current.withdraw(2500);  // within overdraft
        current.withdraw(800);   // exceeds overdraft
        current.deposit(2000);
        current.showBalance();
    }
}
