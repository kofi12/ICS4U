package Unit_2;

import java.util.Scanner;

/**
 * Created by aaronhaizel on 2018-02-14.
 */
public class Practice
{

    //Area of a circle = pi* r(squared)
    //Circumference = 2 * pi * r
    public static double circleArea(double radius)
    {
        double area = Math.PI * (Math.pow(radius,2));
        return area;
    }

    public static double circleCirc(double radius)
    {
        double circ = 2*((Math.PI) * radius);
        return circ;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Give me a radius please!");

        double radius = in.nextDouble();

        double circ, area;

        circ = circleCirc(radius);

        area = circleArea(radius);

        System.out.println("area is " + area);
        System.out.println("circ is " + circ);
    }
}
