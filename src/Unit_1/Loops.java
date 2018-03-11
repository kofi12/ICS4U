package Unit_1;

import java.util.Scanner;

/**
 * Created by aaronhaizel on 2018-02-14.
 */
public class Loops
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("How many stars?");
        int numOfStars;

        countDown('*', numOfStars = in.nextInt());

    }

    public static void countDown(char c, int n)
    {
        int i,j,temp;
        temp = n;

        for (i = n; i != 0; i--)
        {
            for (j = 0; j < temp; j++)
            {
                System.out.print('*');
            }
            System.out.println();
            temp--;
        }
    }
}
