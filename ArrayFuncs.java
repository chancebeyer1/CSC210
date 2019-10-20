package csc210;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class ArrayFuncs
{

    
    public static double sum(double[] a)
    {
        double sum = 0;
        int i = 0;
        while (i < a.length)
        {
            sum = sum + a[i];
            i = i + 1;
        }
        return sum;
    }

    public static double[] random(int size)
    {
        double[] a = new double[size];
        int i = 0;
        while (i < a.length)
        {
            a[i] = Math.random();
            i = i + 1;
        }

        return a;
    }

    public static double max(double[] a)
    {
        double max = a[0];
        for (int i = 0; i < a.length; i++)
        {
            if (max < a[i])
            {
                max = a[i];
            }
        }
        return max;
    }

    public static int find(double[] a, double number)
    {
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == number)
            {
                return i;
            }
        }
        return -1;
    }
        public static <T> ArrayList<T> filter2(ArrayList<T> L,
            Predicate<T> pred)
    {
        ArrayList<T> result = new ArrayList<>();
        for (T s : L)
        {
            if (pred.test(s))
            {
                result.add(s);
            }
        }

        return result;
    }
         public static <T, R> ArrayList<R> map(ArrayList<T> L,
            Function<T, R> f)
         {
             ArrayList<R> result = new ArrayList<>();
        for( T x : L)
        {
            result.add(f.apply(x));
        }
        return result;
         }
}
