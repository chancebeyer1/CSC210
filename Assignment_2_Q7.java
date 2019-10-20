package csc210;

import java.util.Scanner;

public class Assignment_2_Q7 
{
    public static void main(String[] args) 
    {
System.out.println("Type the principal of investment ");
        Scanner s = new Scanner(System.in);
        double P = s.nextInt();
        
        System.out.println("Type the term of investment ");
        Scanner s2 = new Scanner(System.in);
        int N = s2.nextInt();
        
        System.out.println("Type the rate of return for investment ");
        Scanner s3 = new Scanner(System.in);
        int R = s3.nextInt();
        
        int year = 0;
        while(N > 0)
        {
            System.out.println("Value of investment at the beginning of year " + year + " is " + P);
            double interest = P * (R * (0.01));
            System.out.println("Interest for year " + year + " is " + interest);
            P = P + interest;
            year++;
            System.out.println("Value of investment at the end of year " + year + " is " + P);
            N = N - 1;
            
        }
    }

}
