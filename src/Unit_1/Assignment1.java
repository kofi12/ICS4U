package Unit_1;

import java.util.Scanner;

/**
 * Name : NABAYEGO RHODA
 * ASSIGNMENT : CALCULATOR
 *DATE : 19th FEBRUARY,2018
 */
public class Assignment1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); //setting up our program to read input using "in" variable of type Scanner

        int numberOne;
        int numberTwo;
        int selection; //two int's that will store the user's input


        System.out.println("Please input number one");
        numberOne = in.nextInt();

        System.out.println("Please input number two");
        numberTwo = in.nextInt();//get input for numberTwo here

        System.out.println("Select 1 to ADD" + "\n2 to SUBTRACT" + "\n3 to MULTIPLY" + "\n4 to DIVIDE");
        selection = in.nextInt();

        if (selection == 1)
        {
            int a = numberOne + numberTwo;
            System.out.println(a);
        }
        if (selection == 2)
        {
            int b = numberOne - numberTwo;
            System.out.println(b);
        }
        if(selection == 3)
        {
            int c = numberOne * numberTwo;
            System.out.println(c);
        }
        if (selection == 4)
        {
            int d = numberOne / numberTwo;
            System.out.println(d);
        }

    }
}