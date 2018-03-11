package Unit_1;

import java.util.Scanner;

/**
 * Created by aaronhaizel on 2018-02-08.
 */
public class CourseGrades
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double avg = 0;
        int markOne = 0, markTwo = 0, markThree = 0, markFour = 0;
        int numberOfCourses = 4;
        markOne = in.nextInt();
        markTwo = in.nextInt();
        markThree = in.nextInt();
        markFour = in.nextInt();
        int sum = markOne + markTwo + markThree + markFour;
        avg = sum / numberOfCourses;

        System.out.println("What are your grades?");

        System.out.println("Your avg is " + avg);



    }
}
