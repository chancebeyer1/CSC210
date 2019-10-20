package csc210;

public class Ellipse 
    {
Point center;
double major, minor;

public Ellipse(Point center, double major, double minor)
{
    this.center = center;
    this.major = major;
    this.minor = minor;
}
public double getArea()
{
    return Math.PI * this.major * this.minor;
}
    }
