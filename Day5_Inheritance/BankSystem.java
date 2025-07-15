package Day5_Inheritance;

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accNo, double balance) {
        this.accountNumber = accNo;
        this.balance = balance;
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        displayBalance();
        System.out.println("Account Type: Savings, Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accNo, double balance, double limit) {
        super(accNo, balance);
        this.withdrawalLimit = limit;
    }

    void displayAccountType() {
        displayBalance();
        System.out.println("Account Type: Checking, Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int lockPeriod;

    FixedDepositAccount(int accNo, double balance, int lockPeriod) {
        super(accNo, balance);
        this.lockPeriod = lockPeriod;
    }

    void displayAccountType() {
        displayBalance();
        System.out.println("Account Type: Fixed Deposit, Lock Period: " + lockPeriod + " months");
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, 50000, 3.5);
        CheckingAccount ca = new CheckingAccount(102, 30000, 25000);
        FixedDepositAccount fda = new FixedDepositAccount(103, 100000, 12);
        sa.displayAccountType();
        System.out.println("-----------------");
        ca.displayAccountType();
        System.out.println("-----------------");
        fda.displayAccountType();
    }
}
