package Unit_1; /**
 * Created by aaronhaizel on 2018-02-13.
 */
import java.util.Scanner;

/**
 * Created by aaronhaizel on 2018-02-13.
 */
public class Assignment_1_Sol
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int numberOne, numberTwo, selection;

        System.out.println("Please input number one.");
        numberOne = in.nextInt();

        System.out.println("Please input number two");
        numberTwo = in.nextInt();

        System.out.println("Select 1 to ADD" +
                "\n2 to SUBTRACT" +
                "\n3 to MULTIPLY" +
                "\n4 to DIVIDE\n");

        selection = in.nextInt();

        if(selection == 1)
        {
            System.out.println(numberOne + numberTwo);
        }
        else if(selection == 2)
        {
            System.out.println(numberOne - numberTwo);
        }
        else if(selection == 3)
        {
            System.out.println(numberOne * numberTwo);
        }
        else if(selection == 4)
            System.out.println(numberOne / numberTwo);


    }
}
