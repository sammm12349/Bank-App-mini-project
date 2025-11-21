import java.util.List;
import java.util.ArrayList;

public class Bank{

    private List<Account> accounts = new ArrayList<>();



    public void addAccount(Account account){
        accounts.add(account);
        System.out.println("Account added");
    }

    public Account findAccount(String accounmtnumber){
        for(Account acc : accounts){
            if(acc.getAccountNumber().equals(accounmtnumber)){
                return acc;

            }
        }
        System.out.println("Account not found");
        return null;
    }

    public void transferFund(String fromAccountNumber, String toAccountNumber, double amount){
        Account fromAccount = findAccount(fromAccountNumber);
        Account toAccount = findAccount(toAccountNumber);

        if(null != fromAccount && null != toAccount){
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transfer " + amount + " from " + fromAccountNumber + " to " + toAccountNumber);
        }
    }

}
