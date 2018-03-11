package Unit_2;

import Unit_2.Person;

public class Student extends Person
{
    private String studentId;
    private int grade;


    public Student()
    {

    }

    public Student(String studentId, int grade)
    {

        this.studentId = studentId;
        this.grade = grade;
    }

    public Student(String name, int age, String gender, String studentId, int grade)
    {
        super(name, age, gender);
        this.studentId = studentId;
        this.grade = grade;
    }

    public String getStudentId()
    {
        return studentId;
    }

    public void setStudentId(String studentId)
    {
        this.studentId = studentId;
    }

    public int getGrade()
    {
        return grade;
    }

    public void setGrade(int grade)
    {
        this.grade = grade;
    }

    @Override
    public String toString()
    {
        return super.toString() +  "\nUnit_2.Student ID: " + studentId + "\nGrade: " + grade;
    }
}
