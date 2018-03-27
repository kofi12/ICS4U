import Unit_2.Assignment_2.CheckingAccount;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Random rng = new Random(); //creates a "Random" object

                                            /* nextInt method of the Random class
                                            provides a random number between 0 and upperbound
                                            (parameters)*/
        int[] randomNum = new int[10];
        int n = 0;

        int i = 0;
        while(i < randomNum.length)
        {
            randomNum[i] = rng.nextInt(100);
            i++;
        }

        System.out.println(Arrays.toString(randomNum));
        boolean b = sequentialSearch(randomNum,n = in.nextInt());
        System.out.println(b);
    }

    public static boolean sequentialSearch(int[] numbers, int numSearch)
    {
        boolean isFound = false;

        for(int i = 0; i < numbers.length || isFound; i++)
        {
            if(numbers[i] != numSearch)
            {
                System.out.println("NOT HERE");
                isFound = false;
            }
            else
            {
                System.out.println("HERE");
                isFound = true;
            }
        }
        return isFound;
    }
}
