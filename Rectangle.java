package csc210;

public class Rectangle 
    {
Point p1, p2, p3, p4;

    public Rectangle(Point p1, Point p2, Point p3, Point p4)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public double getWidth()
    {
        return Functions.distance(p1.x, p1.y, p2.x, p2.y);
    }
    public double getHeight()
    {
        return Functions.distance(p2.x, p2.y, p3.x, p3.y);
    }
    public double getArea()
    {
        double d12 = Functions.distance(p1.x, p1.y, p2.x, p2.y);
        double d23 = Functions.distance(p2.x, p2.y, p3.x, p3.y);
        return d12 * d23;
    }
    public double getPerimeter()
    {
        double d12 = Functions.distance(p1.x, p1.y, p2.x, p2.y);
        double d23 = Functions.distance(p2.x, p2.y, p3.x, p3.y);
        return (d12 * 2) + (d23 * 2);
    }
}
