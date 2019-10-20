package csc210;
public class RectCalls 
{
    public static void main(String[] args) 
    {
        Rectangle r = new Rectangle(new Point(0, 0), new Point(0, 5), new Point(5, 5), new Point(5, 0));
        double a1 = r.getArea();
        System.out.println(a1);
        
        Rectangle r2 = new Rectangle(new Point(0, 0), new Point(0, 7), new Point(20, 7), new Point(20, 0));
        double a2 = r2.getArea();
        System.out.println(a2);
    }

}
