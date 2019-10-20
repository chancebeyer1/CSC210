package csc210;

public class RightTriangle
{
    Point p1;
    Point p2;
    Point p3;

    public RightTriangle(Point p1, Point p2, Point p3)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public double getArea()
    {
        double d12 = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
        double d23 = Math.sqrt(Math.pow(p2.x - p3.x, 2) + Math.pow(p2.y - p3.y, 2));
        return 1 / 2.0 * d12 * d23;
    }
}
