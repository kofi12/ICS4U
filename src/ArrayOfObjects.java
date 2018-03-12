
import Unit_2.Student;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObjects
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[4];

        String name;
        String studentId;
        String gender;
        int grade;
        int age;

        int i = 0;
        while(i < students.length)
        {
            System.out.println("Give me a name!");
            name = in.next();
            System.out.println("Give me an ID!");
            studentId = in.next();
            System.out.println("Give me a gender!");
            gender = in.next();
            System.out.println("Give me a grade");
            grade = in.nextInt();
            System.out.println("Give me an age!");
            age = in.nextInt();

            students[i] = new Student(name, age, gender, studentId, grade);

            i++;
        }

        System.out.println(Arrays.toString(students) + "\n");
    }

}
