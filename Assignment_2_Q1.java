package csc210;

import java.util.Scanner;

public class Assignment_2_Q1 
{
    public static void main(String[] args) 
    {
System.out.println("Type a integer ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        
        if (a % 5 == 0)
                {
                    System.out.println("Is divisible by 5");
                }
        else
        {
            System.out.println("Isn't divisible by 5");
        }
    }

}
