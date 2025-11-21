public class Account{


    private String accountNumber;
    private String accountHolder;
    protected double balance;



    public Account(String accountNumber, String accountHolder, double balance) {
        super();
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;

    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("You added " + amount + " to the account your balance is " + balance);
    }
    public void withdraw(double amount) {
        if (amount <= balance){
            balance -= amount;
            System.out.println("You removed " + amount + " from the account");
        }
        else {
            System.out.println("Insufficient balance");
        }

    }
    public void checkbalance() {
        System.out.println("The Balance is " + balance);

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
