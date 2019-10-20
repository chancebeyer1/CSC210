package csc210;

import java.util.Scanner;

public class Assignment_1_Q3
{

    public static void main(String[] args)
    {

        System.out.println("Type a height for a cylinder ");
        Scanner s = new Scanner(System.in);
        double heightLenStr = s.nextDouble();

        System.out.println("Type a radius for a cylinder ");
        Scanner r = new Scanner(System.in);
        double radiusLenStr = r.nextDouble();
        double volume = heightLenStr * radiusLenStr * radiusLenStr * (Math.PI);
        System.out.println("The volume of a cylinder with the given radius "
                + (radiusLenStr) + " and the given height " + (heightLenStr) + " is " + (volume));
    }

}
