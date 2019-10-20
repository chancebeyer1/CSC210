package csc210;

import java.util.Scanner;

public class Assignment_1_Q4
{

    public static void main(String[] args)
    {
        System.out.println("Type a base for a right triangle ");
        Scanner s = new Scanner(System.in);
        double baseLenStr = s.nextDouble();

        System.out.println("Type a height for a right triangle ");
        Scanner r = new Scanner(System.in);
        double heightLenStr = r.nextDouble();
        double hypotenuse = Math.sqrt(Math.pow(heightLenStr, 2) + Math.pow(baseLenStr, 2));
        System.out.println("The hypotenuse of a right triangle with the given base "
                    + (baseLenStr) + " and the given height " + (heightLenStr) + " is " + (hypotenuse));
    }

}
