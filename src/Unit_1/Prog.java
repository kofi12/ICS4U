package Unit_1;

import java.util.Scanner;

/**
 * Created by aaronhaizel on 2018-02-14.
 */
public class Prog
{
    public static void main(String[] args)
    {
        int height, width, weight;

        Scanner input = new Scanner(System.in);

        System.out.println("Give me a height");
        height = input.nextInt();
        System.out.println("Give me a width");
        width = input.nextInt();
        System.out.println("Give me a weight");
        weight = input.nextInt();
        int total = height + width + weight;

        if(total > 100)
        {
            System.out.println("You're okay!");
        }
        else System.out.println("You're not okay!");

        System.out.println("done");
    }






}
