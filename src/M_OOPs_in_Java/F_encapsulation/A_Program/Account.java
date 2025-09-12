package M_OOPs_in_Java.F_encapsulation.A_Program;

public class Account {
    private double salary;
    public void deposite(double n){
        salary += n;
    }
    public double withdraw(double n){
        salary -= n;
        return salary;
    }
    protected void BalanceCheck(){
        if(salary==0){
            System.out.println("empty account");
        }
        else{
            System.out.println("Amount is your account: "+salary);
        }
    }
    public static void main(String[] args) {
        Account holder = new Account();
        holder.BalanceCheck();
        holder.deposite(2000);
        holder.BalanceCheck();
        holder.withdraw(1000);
        holder.BalanceCheck();
    }
}
