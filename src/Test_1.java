import Unit_1.Loops;

import java.util.Scanner;

/**
 * Created by aaronhaizel on 2018-02-14.
 */
public class Test_1 extends Loops
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int i, j, temp, input;
        i = 0; j = 0;

        input = in.nextInt();
        temp = input;

        for(i = 0; i < input; i++)
        {
            
            for(j = 0; j < temp; j++)
            {
                System.out.println("* " + temp + " *");
            }
            temp--;
        }
        System.out.println("temp = " + temp + "\n input = " + input);
    }
}
