import java.util.Scanner;
import java.util.ArrayList;
public class ATM {
    private Account account;

    // Constructor
    public ATM(Account account) {
        this.account = account;
    }

    // Methods
    public void displayMenu() {
        System.out.println("ATM Menu");
        System.out.println("1. Transactions History");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Quit");
    }

    public void transactionsHistory() {
        ArrayList<String> history = account.getTransactionHistory();
        if (history.isEmpty()) {
            System.out.println("Transaction History is empty.");
        } else {
            System.out.println("Displaying Transaction History:");
            for (String transaction : history) {
                System.out.println(transaction);
            }
        }
    }

    public void withdraw(double amount) {
        if (amount > account.getBalance()) {
            System.out.println("Insufficient balance.");
        } else {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdraw successful. New balance: " + account.getBalance());
        }
    }

    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposit successful. New balance: " + account.getBalance());
    }

    public void transfer(String recipientId, double amount) {
        if (amount > account.getBalance()) {
            System.out.println("Insufficient balance for transfer.");
        } else {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Transfer successful. New balance: " + account.getBalance());
        }
    }

    public double getBalance() {
        return account.getBalance();
    }
}
