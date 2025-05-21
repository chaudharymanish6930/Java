package N_Assignment.BankSystemProject;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: ₹" + interest);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            super.withdraw(amount);
        } else {
            System.out.println("SavingsAccount: Not enough balance to withdraw ₹" + amount);
        }
    }
}
