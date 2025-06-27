public class BankAccount {
    // Static: shared across all accounts
    public static String bankName = "MyBank";
    private static int totalAccounts = 0;

    // Final: cannot be changed once assigned
    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor: use 'this' to resolve ambiguity
    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        totalAccounts++;
    }

    // Static method to get total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Instance methods
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) balance -= amount;
    }

    // Display details only if obj is instance of BankAccount
    public static void printAccountDetails(Object obj) {
        if (obj instanceof BankAccount) {  // using instanceof operator :contentReference[oaicite:1]{index=1}
            BankAccount acct = (BankAccount) obj;
            System.out.println("Bank: " + bankName);
            System.out.println("Holder: " + acct.getAccountHolderName());
            System.out.println("Account #: " + acct.getAccountNumber());
            System.out.println("Balance: " + acct.getBalance());
        } else {
            System.out.println("Object is not a BankAccount");
        }
    }
}
