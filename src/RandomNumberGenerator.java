import Unit_2.Assignment_2.CheckingAccount;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator
{
    public static void main(String[] args)
    {

        long startTime = System.nanoTime();

        Scanner in = new Scanner(System.in);

        Random rng = new Random(); //creates a "Random" object

                                            /* nextInt method of the Random class
                                            provides a random number between 0 and upperbound
                                            (parameters)*/
        int[] randomNum = new int[2_000_000];
        int n = 0;

        int i = 0;
        while(i < randomNum.length)
        {
            randomNum[i] = rng.nextInt(1_000_00);
            i++;
        }

        System.out.println(Arrays.toString(randomNum));
        boolean b = sequentialSearch(randomNum,n = in.nextInt());
        System.out.println(b);

        long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;

        System.out.println("Time elapsed in nano seconds is..." + timeElapsed);
        System.out.println("Time elapsed in milliseconds seconds is..." + timeElapsed/1000000);
    }

    public static boolean sequentialSearch(int[] numbers, int numSearch)
    {
        boolean isFound = false;

        for(int i = 0; i < numbers.length && !isFound; i++)
        {

            if(!isFound)
            {
                if(numbers[i] != numSearch)
                {
                    isFound = false;
                }
                else
                {
                    isFound = true;
                }
            }
        }
        return isFound;
    }

    public static boolean binarySearch(int[] numbers, int numSearch)
    {
        int middle;
        int top = numbers.length - 1;
        int bottom = 0;
        boolean isFound = false;

        int location = -1;

        while(bottom <= top && !isFound)
        {
            middle = (bottom + top)/2;
            if(numbers[middle] == numSearch)
            {
                location = middle;
                isFound = true;
            }
            if(numbers[middle] < numSearch)
            {
                bottom = middle + 1;
            }
            else if(numbers[middle] > numSearch)
            {
                top = middle - 1;
            }
        }

        return isFound;
    }
}
