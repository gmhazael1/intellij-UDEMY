package entities;

public class Bank {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Bank(int accountNumber, String accountHolder, double depositInitial) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        depositAcc(depositInitial);
    }

    public Bank(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public int getAccNumber() {
        return accountNumber;
    }

    public double getBalanceAcc() {
        return balance;
    }

    public String getNameAcc() {
        return accountHolder;
    }

    public void setNameAcc(String nameAcc) {
        this.accountHolder = nameAcc;
    }

    public void depositAcc(double deposit) {
        this.balance += deposit;
    }

    public void withdrawAcc(double withdraw) {
        this.balance -= withdraw + 5.0 ;
    }

    public String toString() {
        return "Account data:\n" + "Account " + accountNumber + ", Holder: " + accountHolder + ", Balance: $" + String.format("%.2f", balance);
    }
}
