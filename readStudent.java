package csc210;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readStudent
{

    public static ArrayList<Student> readStudents(String fileName) throws IOException
    {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        ArrayList<Student> result = new ArrayList<>();
        while (true)
        {
            String line = br.readLine();
            if (line == null)
            {
                break;
            }
            String[] attributes = line.split(",");
            String name = attributes[0];
            int id = Integer.parseInt(attributes[1].strip());
            double gpa = Double.parseDouble(attributes[2]);
            Student stuObject = new Student(name, id, gpa);
            result.add(stuObject);
        }
        return result;
    }

    public static Student find(ArrayList<Student> students, int id)
    {
        for (int i = 0; i < students.size(); i++)
        {
            Student stu = students.get(i);
            if (stu.getId() == id)
            {
                return stu;
            }
        }
        return null;
    }

    public static String findName(ArrayList<Student> students, int id)
    {
        Student stu = find(students, id);
        return stu.getName();

    }

    public static double findGPA(ArrayList<Student> students, int id)
    {
        Student stu = find(students, id);
        return stu.getGPA();
    }

    public static ArrayList<Student> findGPA(ArrayList<Student> students, double gpa)
    {
        ArrayList<Student> HighGPA = new ArrayList<>();
        for (int i = 0; i < students.size(); i++)
        {
            Student stu = students.get(i);
            if (stu.getGPA() > gpa)
            {
                HighGPA.add(stu);
            }
        }
        return HighGPA;
    }

    public static void main(String[] args) throws IOException
    {
        ArrayList<Student> s = readStudents("C:/Users/chanc/OneDrive/Desktop/student.txt");
        System.out.print(s);

        Student a = find(s, 2684);
        System.out.print(a);
        String b = findName(s, 7654);
        System.out.print(b);
        double c = findGPA(s, 7654);
        System.out.print(c);
        ArrayList<Student> d = findGPA(s, 3.0);
        System.out.print(d);
    }

}
