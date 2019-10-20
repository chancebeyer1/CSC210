package csc210;

import java.util.Arrays;

public class Python_Review
{

    public static double max(double a, double b)
    {
        if (a > b)
        {
            return a;
        } else
        {
            return b;
        }
    }

    public static void main(String[] args)
    {
        double[] a = { 2, 4, 6, 8};
        double[] b = {2.4, 3.6, 12.3};
        
        System.out.println(Arrays.toString(a));
        
//        double[] L = new double[10];
//        System.out.println(L);
//        
//        int pos = 0;
//        double sum = 0;
//        while(pos < L.length)
//        {
//            double num = L[pos];
//            sum = sum + num;
//            pos = pos + 1;
//        }
    }

}
