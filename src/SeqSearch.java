import Unit_2.Assignment_2.CheckingAccount;
import Unit_2.Assignment_2.SavingsAccount;

import java.util.Arrays;
import java.util.Scanner;

public class SeqSearch
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        final int ACCOUNT_SIZE = 3;
        String accountNumber;
        String accountHolder;
        double balance;

        int[] numbers = {5,3,9,2,1};

        //CheckingAccount[] accounts = new CheckingAccount[ACCOUNT_SIZE];

        //for(int i = 0; i < accounts.length; i++)                //traversing the array
        //{
           // accounts[i] = new CheckingAccount(accountHolder = in.next(),            //filling the array with CheckingAccounts
                  //  accountNumber = in.next(),
                    //balance = in.nextDouble());

        //boolean b = sequentialSearch(accounts, "ANDREW");
        //System.out.println("\n" + b);

        System.out.println(Arrays.toString(numbers));
        insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));

    }


    public static boolean sequentialSearch(CheckingAccount[] checkingAccounts, String name)
    {
        boolean isFound = false;
        int i = 0;

        for(i = 0; i < checkingAccounts.length && !isFound; i++) //traverse the passed in array
        {
            if(!isFound) // if isFound is true then we exit this whole block of statements
            {
                if(!checkingAccounts[i].getAccountHolder().equals(name))
                {
                    isFound = false;
                }
                else
                {
                    isFound = true;
                }
            }
        }
        System.out.println(i);
        return isFound;
    }

    public static void insertionSort(int[] list)
    {
        // {5,3,9,2,1}

        for(int current = 1; current < list.length; current++)
        {

            int temp = list[current];
            int top = current;

            while(top > 0 && temp < list[top - 1])
            {
                list[top] = list[top - 1];
                top--;
            }
            list[top] = temp;
        }
    }
}
