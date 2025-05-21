package N_Assignment.BankSystemProject;

public class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn with overdraft: ₹" + amount);
        } else {
            System.out.println("CurrentAccount: Overdraft limit exceeded.");
        }
    }
}
