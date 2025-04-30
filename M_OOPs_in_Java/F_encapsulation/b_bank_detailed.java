package M_OOPs_in_Java.F_encapsulation;
class BankAccount {
    // Private fields (encapsulation)
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    // Getter for account holder name
    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}

public class b_bank_detailed {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Amit", 5000);

        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Balance: $" + acc.getBalance());

        acc.deposit(1500);   // Output: Deposited $1500
        acc.withdraw(2000);  // Output: Withdrew $2000
        acc.withdraw(6000);  // Output: Insufficient balance or invalid amount

        System.out.println("Final Balance: $" + acc.getBalance());
    }
}
