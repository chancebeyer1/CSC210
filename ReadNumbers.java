package csc210;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadNumbers
{

    public static double sum(ArrayList<Double> L)
    {
        double sum = 0;
        for (double i : L)
        {
            sum = sum + i;
        }
        return sum;
    }

    public static double min(ArrayList<Double> L)
    {
        double min = L.get(0);
        for (int i = 1; i < L.size(); i++)
        {
            if (L.get(i) < min)
            {
                min = L.get(i);
            }
        }
        return min;
    }

    public static double range(ArrayList<Double> L)
    {
        double min = min(L);
        double max = L.get(0);
        for (int i = 1; i < L.size(); i++)
        {
            if (L.get(i) > max)
            {
                max = L.get(i);
            }
        }
        return max - min;
    }

    public static double average(ArrayList<Double> L)
    {
        double sum = sum(L);
        return sum / L.size();
    }

    public static ArrayList<Integer> evens(ArrayList<Integer> L)
    {
        ArrayList<Integer> evens = new ArrayList<>();
        for (int i = 0; i < L.size(); i++)
        {
            if (L.get(i) % 2 == 0)
            {
                evens.add(L.get(i));
            }
        }
        return evens;
    }
    public static ArrayList<Double> index(ArrayList<Double> L, ArrayList<Integer> P)
    {
        ArrayList<Double> values = new ArrayList<>();
        for(Integer pos : P)
        {
            values.add(L.get(pos));
        }
        return values;
    }

    public static ArrayList<Double> readNumbers(String fileName) throws IOException
    {
        FileReader fr = new FileReader(fileName);
        BufferedReader br = new BufferedReader(fr);

        ArrayList<Double> result = new ArrayList<>();
        while (true)
        {
            String line = br.readLine();
            if (line == null)
            {
                break;
            }
            String[] values = line.split(",");
            for (String value : values)
            {
                double num = Double.parseDouble(value);
                result.add(num);
            }

        }
        return result;
    }

    public static void main(String[] args) throws IOException
    {
        ArrayList<Double> a = readNumbers("C:/Users/chanc/OneDrive/Desktop/nums.txt");
        System.out.println(a);
        ArrayList<Integer> ab = new ArrayList<>();
        ab.add(2);
        ab.add(3);
        ab.add(6);
        double b = sum(a);
        System.out.println(b);
        double c = min(a);
        System.out.println(c);
        double d = range(a);
        System.out.println(d);
        double e = average(a);
        System.out.println(e);
        ArrayList<Integer> f = evens(ab);
        System.out.println(f);
        ArrayList<Double> g = index(a,ab);
        System.out.println(g);
    }

}
