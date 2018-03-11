package Unit_1;

import java.util.Scanner;

/**
 * Created by aaronhaizel on 2018-02-22.
 */
public class GroupWork
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int countFrom,countTo,countBy;

        System.out.print("Count from : ");
        countFrom = in.nextInt();

        System.out.print("Count to : ");
        countTo = in.nextInt();

        System.out.print("Count by : ");
        countBy = in.nextInt();


        while(countFrom<=countTo)
        {

            System.out.print(" " + countFrom);
            countFrom+=countBy;

        }

        for(;countFrom <= countTo; countFrom += countBy)
        {
            System.out.print(countFrom + " ");
        }
    }
}
