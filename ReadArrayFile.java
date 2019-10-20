package csc210;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadArrayFile
{

    public static ArrayList<Double> readArray(String fileName) throws IOException
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
            double num = Double.parseDouble(line);
            result.add(num);
        }
        return result;
    }

    
//    public static MyArrayList readArray2(String fileName) throws IOException
//    {
//        FileReader fr = new FileReader(fileName);
//        BufferedReader br = new BufferedReader(fr);
//
//        MyArrayList L = new MyArrayList();
//        while (true)
//        {
//            String line = br.readLine();
//            if (line == null)
//            {
//                break;
//            }
//            double num = Double.parseDouble(line);
//            L.add(num);
//        }
//        return L;
//    }

//    public static void main(String[] args) throws IOException
//    {
//        MyArrayList a = readArray2("C:/Users/chanc/OneDrive/Desktop/nums.txt");
//        System.out.println(Arrays.toString(a.nums));
//        int b = a.size();
//        System.out.println(b);
//        a.delete(2);
//        System.out.println(Arrays.toString(a.nums));
//        a.trim();
//        System.out.println(Arrays.toString(a.nums));
//        
//        MyArrayList K = new MyArrayList();
//        int N = 1000000;
//        long start = System.currentTimeMillis();
//        for(int i = 0; i <= N; i++)
//        {
//            K.add(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);
//    }
}
