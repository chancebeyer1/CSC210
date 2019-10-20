package csc210;

import java.util.function.Function;

public class CSC210
{
public static double distance(double x1, double y1, double x2, double y2)
{
    return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
}
    public static double square(double x)
    {
        return x * x;
    }
    
        public static double cube(double x)
    {
        return x * x * x;
    }

    public static double areaUnderCurve(double a, double b, int N, 
        Function<Double, Double> f)
    {
        double areaUnderCuruve = 0;
        double x = a;
        double rectWidth = (b - a) / N;
        while (x < b)
        {
            double rectHeight = f.apply(x);
            double rectArea = rectHeight * rectWidth;
            areaUnderCuruve = areaUnderCuruve + rectArea;
            x = x + rectWidth;
        }

        return areaUnderCuruve;
    }

    public static void main(String[] args)
    {
        double area = areaUnderCurve(10, 30, 100, CSC210::square);
        System.out.println(area);

        double area1 = areaUnderCurve(5, 300, 1000, CSC210::cube);
        System.out.println(area1);
        
        
        int x = 7;
        double[] a = new double[x];
        
        a[0] = 1;
        a[1] = 2.4;
        a[2] = 3.6;
        a[3] = 4.1;
        
        double m = ArrayFuncs.max(a);
        
        
System.out.println(m);
        
        double sum = 0;
        int i = 0;
        while(i < a.length)
        {
            sum = sum + a[i];
            i = i + 1;
        }   
        
        for(int in = 0; in < a.length; in++)
        {
            sum = sum + a[in];        
        }
    }     
}
//        double a = 1.4;
//        double b = 2.0;
//        long c = 6L;
//        System.out.println(c);
//
////        Reads one double from the keyboard
//        System.out.println("Type some value in ");
//        Scanner s = new Scanner(System.in);
//        double x = s.nextDouble();
//        System.out.println(x);
//
////          While statement
//        int i = 1;
//        while (i < 10)
//        {
//            System.out.println(i);
//            i = i + 1;
//        }
//
//        //  If and else statements
//        if (a < b)
//        {
//            System.out.println("TEST");
//        } else
//        {
//            System.out.println("Test 2");
//        }
//        
//    int C = 10;
//    while (C <= 50)
//        {
//            double F = 9 / 5.0 * (C + 32);
//        System.out.println(C + " " + F);
//        C = C + 10;
//    }
//}