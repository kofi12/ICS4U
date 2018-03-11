import java.util.Scanner;

/**
 * Created by aaronhaizel on 2018-02-16.
 */
public class Prac
{

    public static void prac(int a, int b)
    {

    }

    public static int add(int a, int b)
    {

        int ansr = a + b;

        return ansr;
    }

    public static double tempFarh(double celsuis)
    {
        double farhenheit;

        return farhenheit = (celsuis * (9.0/5.0)) + 32;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("give me celsius");
        double c = in.nextDouble();
        double f = tempFarh(c);

        System.out.println(c + " degrees celsuis is " + f + " in farhenheit");

    }
}
