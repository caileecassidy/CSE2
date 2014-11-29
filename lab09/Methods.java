/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, lab09
//October 22, 2014
//Version 1
//Objective: Practice writing methods
//
//Assignment: 
//
import java.util.Scanner;

public class Methods
{
    public static void main(String[] arg) 
    {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three ints");
        
        a = getInt(scan);
        b = getInt(scan);
        c = getInt(scan);
        
        System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
        System.out.println("The larger of "+a+", "+b+", and "+c+
            " is "+(larger(a, larger(b,c))));
        //System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
            //", and "+c+" are in ascending order");
    }
    
    public static int larger(int a, int b)
    {
        if(a > b)
        {
            return a;
        }
        else
        {
            return b; 
        }
    }
    
    /*public static int ascending(int a, int b, int c)
    {
        int temp = 0;
        while(a > b && a > c)
        {
            if(c > b)
            {
                temp = b;
                b = c;
                c = temp;
            }
        }
        
        while(b > a && b > c)
        {
            if(c > a)
            {
                temp = a;
                a = b;
                b = c;
                c = temp;
            }
            else
            {
                temp = a;
                a = b;
                b = a;
            }
        }
        
        while(c > a && c > b)
        {
            if(b > a)
            {
                temp = a;
                a = c;
                c = a;
            }
            else
            {
                temp = a;
                a = c;
                c = b;
                b = a;
            }
        }
        return (a, b, c); */

    }
