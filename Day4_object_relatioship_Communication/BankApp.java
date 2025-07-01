import java.util.ArrayList;

class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    void deposit(double amount) {
        balance += amount;
    }

    double getBalance() {
        return balance;
    }
}

class Customer {
    String name;
    ArrayList<Account> accounts = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addAccount(Account account) {
        accounts.add(account);
    }

    void viewBalance() {
        System.out.println("Balances for " + name + ":");
        for (Account a : accounts) {
            System.out.println("Account: " + a.accountNumber + ", Balance: $" + a.getBalance());
        }
    }
}

class Bank {
    String name;
    ArrayList<Customer> customers = new ArrayList<>();

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer customer, String accountNumber) {
        Account account = new Account(accountNumber);
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account " + accountNumber + " opened for " + customer.name + " in " + name);
    }
}


public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        Customer name = new Customer("Aman Singh");
        Customer bob = new Customer("Bob");

        bank.openAccount(name, "A1001");
        bank.openAccount(bob, "B2001");
        bank.openAccount(bob, "B2002");  
        name.accounts.get(0).deposit(1000);
        bob.accounts.get(0).deposit(500);
        bob.accounts.get(1).deposit(1500);

   
        name.viewBalance();
        bob.viewBalance();
    }
}
