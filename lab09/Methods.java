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
        System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
            ", and "+c+" are in ascending order");
    }
    
    public static int getInt(Scanner scan)
    {
        return scan.nextInt();
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
    
    public static boolean ascending(int a, int b, int c)
    {
        int temp = 0;
        
        while(b < a)
        {
            return false; 
        }
        
        while(c < a)
        {
            return false;
        }
         
        while(c < b)
        {
            return false;
        }
        
        while(a < b && a < c)
        {
            if(b > c)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        return true;
    }
}
