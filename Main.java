public class Main {
    public static void main(String[] args) {
        //creating objects
        Bank bank = new Bank();

        SavingsAccount savings = new SavingsAccount("SS123","Samuel Allen", 1000,2.5);
        CurrentAccount current = new CurrentAccount("SS456","Jon",5000,2000);

        // adds accunts into the bank
        bank.addAccount(current);
        bank.addAccount(savings);

        savings.deposit(1000);
        current.withdraw(3000);

        savings.addInterest();

        bank.transferFund("CA904","SS990",5000);
        current.checkbalance();
        savings.checkbalance();
    }
}