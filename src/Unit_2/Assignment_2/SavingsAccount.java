package Unit_2.Assignment_2;

public class SavingsAccount extends BankAccount implements Bankable
{
    /* When you withdraw from a SavingsAccount there should be a 5% penalty
    meaning you should take away 5% of the balance from the balance
     */

    public SavingsAccount()
    {
    }

    public SavingsAccount(String accountNumber, String accountHolder, double balance)
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
        double penalty = 0.05;
        balance -= (balance * penalty);
        this.setBalance(balance);

        return balance;
    }
}
