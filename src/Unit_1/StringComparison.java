package Unit_1;

import java.util.Scanner;

/**
 * Created by aaronhaizel on 2018-02-14.
 */
public class StringComparison
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);



        String name = in.next();
        String myName = "Arnold";

        if(name.equals(myName))
        {
            System.out.println("We have the same name!");
        }
        else
        {
            System.out.println("Our names are different");
        }

        System.out.println("done");
    }
}
