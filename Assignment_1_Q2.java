package csc210;
import java.util.Scanner;
public class Assignment_1_Q2
{

    public static void main(String[] args)
    {
        System.out.println("Type a height for a rectangle ");
        Scanner s = new Scanner(System.in);
        double heightLenStr = s.nextDouble();
        System.out.println("Type a width for a rectangle ");
        Scanner r = new Scanner(System.in);
        double widthLenStr = r.nextDouble();
        double area = heightLenStr * widthLenStr;
        System.out.println("The area is " + area);
    }

}
