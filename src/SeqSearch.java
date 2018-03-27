import Unit_2.Assignment_2.CheckingAccount;
import Unit_2.Assignment_2.SavingsAccount;

import java.util.Arrays;
import java.util.Scanner;

public class SeqSearch
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        final int ACCOUNT_SIZE = 1;
        String accountNumber;
        String accountHolder;
        double balance;

        CheckingAccount[] accounts = new CheckingAccount[ACCOUNT_SIZE];

        for(int i = 0; i < accounts.length; i++)
        {
            accounts[i] = new CheckingAccount(accountHolder = in.next(),
                    accountNumber = in.next(),
                    balance = in.nextDouble());
        }
        boolean b = sequentialSearch(accounts, "ANDREW");
        //System.out.println(accounts[0].getAccountHolder());
    }

    public static boolean sequentialSearch(CheckingAccount[] checkingAccounts, String name)
    {
        boolean isFound = false;

        for(int i = 0; i < checkingAccounts.length || isFound; i++)
        {
            if(checkingAccounts[i].getAccountHolder() != name)
            {
                System.out.println(name + " doesn't exist in our database");
                isFound = false;
            }
            else
            {
                System.out.println(name + " has an account with us");
                isFound = true;
            }
        }
        return isFound;
    }
}
