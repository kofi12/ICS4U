package Unit_1;

import java.util.Scanner;

public class XAndY
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double j = 2;
        double calculation = whateverIWant(j);

        System.out.println(calculation);

    }



    public static double whateverIWant(double x)
    {
        double y;
        if(x < 0)
        {
            y = x * x;
        }
        else
        {
            y = x * x * x;
        }
        return y;
    }



}
