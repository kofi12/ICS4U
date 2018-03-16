package Unit_2.Assignment_2;

import java.util.Scanner;

public class BankAccountTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        BankAccount someAccount;


        double depo;
        double wd;
        int selection = 0;

        System.out.println("1: CheckingAccount\n2: SavingsAccount");

        if((selection = in.nextInt()) == 1)
        {
            CheckingAccount checkingAccount = new CheckingAccount("1234", "Johnny", 0);
            System.out.println("deposit an amount: ");
            checkingAccount.deposit(depo = in.nextDouble());
            System.out.println("withdraw an amount: ");
            checkingAccount.withdraw(wd = in.nextDouble());
            someAccount = checkingAccount;
        }
        else
        {
            SavingsAccount savingsAccount = new SavingsAccount("5678", "Jane", 0);
            System.out.println("deposit an amount: ");
            savingsAccount.deposit(depo = in.nextDouble());
            System.out.println("withdraw an amount: ");
            savingsAccount.withdraw(wd = in.nextDouble());
            someAccount = savingsAccount;
        }

        System.out.println("Here is your banking information...\n" + someAccount);

    }
}
