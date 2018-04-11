package Unit_2.Assignment_2;

public class BankAccount
{
    private String accountNumber;
    private String accountHolder;
    private double balance;


    public BankAccount()
    {

    }

    public BankAccount(String accountNumber, String accountHolder, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder()
    {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder)
    {
        this.accountHolder = accountHolder;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    @Override
    public String toString()
    {
        double balance = this.getBalance();
        String.format("$%,.2f",balance);

        return "Account Number: " + this.getAccountNumber() +
                "\n" + "Account Holder: " + this.getAccountHolder() +
                "\n" + "Balance: " + String.format("$%,.2f",balance);
    }
}
