package Unit_1;

import java.util.Scanner;

/**
 * Created by aaronhaizel on 2018-02-27.
 */
public class AnotherCalculatorWithMethods
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);

        System.out.println("what is the first number?");
        int numberOne = in.nextInt();
        System.out.println("what is the second number?");
        int numberTwo = in.nextInt();

        System.out.println(numberOne + " + " + numberTwo + " = " +  add(numberOne,numberTwo) + "\n");
        System.out.println(numberOne + " - " + numberTwo + " = " +  subtract(numberOne,numberTwo) + "\n");
        System.out.println(numberOne + " * " + numberTwo + " = " +  multiply(numberOne,numberTwo) + "\n");
        System.out.println(numberOne + " / " + numberTwo + " = " +  divide(numberOne,numberTwo));
    }



    public static int add(int a, int b)
    {
        return a + b;
    }

    public static int subtract(int a, int b)
    {
        return a - b;
    }

    public static int multiply(int a, int b)
    {
        return a * b;
    }

    public static int divide(int a, int b)
    {
        return a / b;
    }
}