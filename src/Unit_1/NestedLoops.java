package Unit_1;

import java.util.Scanner;

/**
 * Created by aaronhaizel on 2018-02-27.
 */
public class NestedLoops
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("how many rows?");
        int r = in.nextInt();
        char b = '^';

        upsideDownRightTriangle(b,r);

    }

    public static void upsideDownRightTriangle(char c, int rows)
    {

        int i,j, temp;
        temp = rows;

        for(i = 0; i < rows; i++)
        {

            for(j = 0; j < temp; j++)
            {
                System.out.print(c);
            }
            System.out.println();
            temp--;
        }
    }
}
