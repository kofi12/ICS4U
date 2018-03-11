package Unit_1;

import java.util.Scanner;

/**
 * Created by aaronhaizel on 2018-02-15.
 */
public class Looper
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Where do I start?");
        int countdown = in.nextInt();
        int temp = countdown;
        int i = 0;

        //do-while loop
        //do
        //{
            //System.out.println(i);
            //i++;
        //}while(i < countdown);


        //for loop
        for(i = 0;i < countdown;i++)
        {
            System.out.println(i);
        }
    }
}
