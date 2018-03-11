package Unit_2;

import java.util.Scanner;

/**
 * Created by aaronhaizel on 2018-02-15.
 */
public class Arrays
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int numbers[] = new int[5];// this is how you declare an array of type int
        int input = 0;

        int i = 0;

        for(i = 0; i < numbers.length; i++)
        {
            System.out.println("Give me a number");
            input = in.nextInt();
            numbers[i] = input;
            //System.out.println(numbers[i]);
        }
    }
}
