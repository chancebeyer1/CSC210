package csc210;

public class Student
{

    private String name;
    private int id;
    private double GPA;

    public Student(String name, int id, double GPA)
    {
        this.name = name;
        this.id = id;
        this.GPA = GPA;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public double getGPA()
    {
        return GPA;
    }

}
