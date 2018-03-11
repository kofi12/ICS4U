package Unit_1;

import java.util.Scanner;

/**
 * Created by aaronhaizel on 2018-02-08.
 */
public class Circle
{
    public static void main(String[] args)
    {
        //Area of a circle = pi* r(squared)
        //Circumference = 2 * pi * r

        Scanner in = new Scanner(System.in);
        final double pi = 3.1415;

        double area = 0, circ = 0, r = 0;
        System.out.println("What is the radius?");
        r = in.nextDouble();
        area = Math.PI * (Math.pow(r,2));
        circ = 2*((Math.PI) * r);


        System.out.println("The area of the circle is " + area +
                "\nThe circumference of the circle is " + circ);
    }
}
