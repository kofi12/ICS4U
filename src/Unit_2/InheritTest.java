package Unit_2;

import Unit_2.Student;

import java.util.Scanner;

public class InheritTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);


        System.out.println("What is your name?");
        String name = in.next();

        System.out.println("What is your age?");
        int age = in.nextInt();

        System.out.println("What is your gender?");
        String gender = in.next();

        System.out.println("What is your studentId?");
        String studentId = in.next();

        System.out.println("What is your grade?");
        int grade = in.nextInt();

        Student s = new Student(name,age,gender,studentId,grade);

        System.out.println(s);

    }
}
