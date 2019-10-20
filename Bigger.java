package csc210;

import java.util.function.Predicate;

public class Bigger implements Predicate<Student>
    {
public boolean test(Student student)
{
    return student.getGPA() > 3;
}
    }
