package csc210;

import static csc210.readStudent.readStudents;
import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentFuncs
{

    public static <T> ArrayList<T> filter(ArrayList<T> L, Predicate<T> P)
    {
        ArrayList<T> result = new ArrayList<>();
        for (T elt : L)
        {
            if (P.test(elt))
            {
                result.add(elt);
            }
        }

        return result;
    }

    private static boolean test(Student s, ArrayList<Predicate<Student>> LP)
    {
        for (Predicate x : LP)
        {
            if (x.test(s) == false)
            {
                return false;
            }
        }
        return true;
    }
    public static ArrayList<Student> filter2(ArrayList<Student> L, ArrayList<Predicate<Student>> LP)
    {
        ArrayList<Student> result = new ArrayList<>();
        for (Student elt : L)
        {
            if (test(elt, LP))
            {
                result.add(elt);
            }
        }
        return result;
    }

    public static <T> boolean all(ArrayList<T> L, Predicate<T> P)
    {
        return filter(L, P).size() == L.size();
    }

    public static <T> boolean any(ArrayList<T> L, Predicate<T> P)
    {
        return filter(L, P).size() >= 1;
    }

    public static Student first(ArrayList<Student> L, Predicate<Student> P)
    {
        if (any(L, P))
        {
            return filter(L, P).get(0);
        }
        else
        {
            return null;
        }
    }

    public static <T> ArrayList<T> takeWhile(ArrayList<T> L, Predicate<T> P)
    {
        ArrayList<T> result = new ArrayList<>();
        for (T elt : L)
        {
            if (P.test(elt))
            {
                result.add(elt);
            }
            else
            {
                return result;
            }
        }

        return result;
    }

    public static void main(String[] args) throws IOException
    {
        ArrayList<Student> s = readStudents("C:/Users/chanc/OneDrive/Desktop/student.txt");

        ArrayList<Student> a = filter(s, i -> i.getGPA() > 3.0);
        System.out.println(a);
        ArrayList<Predicate<Student>> pred = new ArrayList<>();
        pred.add(i -> i.getGPA() > 3.0);
        pred.add(i -> i.getGPA() < 5.0);
        pred.add(i -> i.getName().charAt(0) == 'c');
        ArrayList<Student> b = filter2(s, pred);
        System.out.println(b);
        boolean c = all(s, i -> i.getGPA() > 1.0);
        System.out.println(c);
        boolean d = any(s, i -> i.getGPA() > 5.0);
        System.out.println(d);
        Student e = first(s, i -> i.getGPA() > 2.0);
        System.out.println(e);
        ArrayList<Student> f = takeWhile(s, i -> i.getGPA() > 3.0);
        System.out.println(f);
    }

}
