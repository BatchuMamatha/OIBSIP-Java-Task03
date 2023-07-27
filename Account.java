import java.util.ArrayList;
public class Account {
    private String userId;
    private String userPin;
    private double balance;
    private ArrayList<String> transactionHistory;

    // Constructor
    public Account(String userId, String userPin, double balance) {
        this.userId = userId;
        this.userPin = userPin;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }

    // Getters and Setters
    public ArrayList<String> getTransactionHistory() {
        return transactionHistory;
    }

    public void addToTransactionHistory(String transaction) {
        transactionHistory.add(transaction);
    }
    public String getUserId() {
        return userId;
    }

    public String getUserPin() {
        return userPin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
