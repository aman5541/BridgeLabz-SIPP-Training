public class BankAccount {
     String accountHolder;
     String accountNumber;
     double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Aman Singh", "12345678", 50000.00);
        acc.deposit(200);
        acc.withdraw(100);
        acc.displayBalance();
    }
}

