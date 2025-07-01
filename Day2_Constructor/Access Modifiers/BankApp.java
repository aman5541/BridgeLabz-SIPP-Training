class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(int accNum, String holder, double bal) {
        super(accNum, holder, bal);
    }

    public void showAccount() {
        System.out.println("Account Number: " + accountNumber);    
        System.out.println("Account Holder: " + accountHolder);    
        System.out.println("Balance: " + getBalance());
    }
}
public class BankApp {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(123456, "Alice", 5000);
        sa.showAccount();
        sa.deposit(1000);
        System.out.println("After Deposit: " + sa.getBalance());
    }
}
