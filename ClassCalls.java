package csc210;

import java.util.Arrays;

public class ClassCalls
{

    public static void main(String[] args)
    {
        RightTriangle t = new RightTriangle(new Point(3, 4), new Point(3, 0), new Point(0, 0));
        System.out.println(t.getArea());
        
        Point[] r = new Point[4];
        r[0] = new Point(0, 0);
        r[1] = new Point(5, 0);
        r[2] = new Point(5, 5);
        r[3] = new Point(0, 5);
        Polygons p = new Polygons(r);
        System.out.println(Arrays.toString(p.corners));

    }

}
