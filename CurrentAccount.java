public class CurrentAccount extends Account {

    private double overdraftLimit;
    public CurrentAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void withdraw(double amount) {
        if(amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        }
        else {
            System.out.println("withdraw has been overdrafted");
        }
    }

}
