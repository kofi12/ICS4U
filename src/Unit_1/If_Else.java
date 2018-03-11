package Unit_1;

import java.util.Scanner;

/**
 * Created by aaronhaizel on 2018-02-15.
 */
public class If_Else
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Are you a robot (y/n)");
        String answer;
        answer = in.nextLine();
        int age = 0;
        double ticketPrice = 0;

        if (answer.equals("y"))
        {
            System.out.println("Access denied!!!");
        }
        else
        {
            System.out.println("How old are you?");
            age = in.nextInt();

            boolean isStudent = (age > 15 && age <= 19);
            if(age >= 65)
            {
                ticketPrice = 5.00;
            }
            else if(age <= 15)
            {
                ticketPrice = 10.00;
            }
            else if(isStudent)
            {
                ticketPrice = 15.00;
            }
            else
            {
                ticketPrice = 20.00;
            }
            System.out.println("ticket price is " + ticketPrice + "$");
        }

    }
}
