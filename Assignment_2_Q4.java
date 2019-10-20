package csc210;

import java.util.Scanner;

public class Assignment_2_Q4 
{
    public static void main(String[] args) 
    {
System.out.println("Type an odd integer ");
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        int pos = 1;
int sum = 0;
while(pos <= N)
{
    sum = sum + pos;
    pos = pos + 2;
}
System.out.println(sum);
    }

}
