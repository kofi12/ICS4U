package Unit_2.Assignment_2;

public class CheckingAccount extends BankAccount implements Bankable
{
    /* Your CheckingAccount class must inherit from the BankAccount class

       I am also expecting methods to allow for the account to "withdraw" and "deposit"
       Create an interface for these two methods
       Override the toString methods for all classes
       When printing out a CheckingAccount or SavingsAccount the output must look like this

       Example

       Account Number: 4172469835
       Account Holder: Jane Doe
       Balance: $200.50
     */


    public CheckingAccount()
    {

    }

    public CheckingAccount(String accountNumber, String accountHolder, double balance)
    {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public double deposit(double dp)
    {
        double balance = this.getBalance();
        balance += dp;
        this.setBalance(balance);

        return balance;
    }

    @Override
    public double withdraw(double wd)
    {
        double balance = this.getBalance();
        balance -= wd;
        this.setBalance(balance);

        return balance;
    }

}
