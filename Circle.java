package csc210;

public class Circle extends Ellipse
{
    //  to initialize a circle object pointed to by this, you have to provide
    //  a center and a radius
    public Circle(Point center, double radius)
    {
        super(center, radius, radius);
    }
}