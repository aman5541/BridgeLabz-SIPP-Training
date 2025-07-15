abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }
    public double getBalance() { return balance; }
    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }
    public double calculateInterest() { return getBalance() * 0.04; }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }
    public double calculateInterest() { return getBalance() * 0.02; }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SB123", "Amit", 10000);
        BankAccount acc2 = new CurrentAccount("CA456", "Neha", 20000);
        System.out.println("Interest for Amit: " + acc1.calculateInterest());
        System.out.println("Interest for Neha: " + acc2.calculateInterest());
    }
}