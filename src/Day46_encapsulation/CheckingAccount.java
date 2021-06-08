package Day46_encapsulation;

public class CheckingAccount {

        private double balance;
    private double accountNumber;
    private String accountHolder;
    private String type = "checking";
        //default is checking, we can change if needed using setter

        //another class we added was CapitalOne
//right click>generate>getter and setter>ok

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
