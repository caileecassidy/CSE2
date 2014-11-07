/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, hw09
//Due: November 4, 2014
//Version 1
//Objective: Practice designing a nested sequence of method calls that
//divide larger problems into subproblems
//
//Assignment: Break problems into smaller, more manageable
//chunks. Add methods to BlockedAgain class, generate input, and solve
//all the subproblems
//
import java.util.Scanner;
public class BlockedAgain
{
    public static void main(String []s)
    {
        int m;
        
        //force user to enter int in range 1-9, inclusive.
        m = getInt();
        allBlocks(m);
    }
    
    public static int getInt()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an int between 1 and 9, inclusive: ");
        String input = scan.next();
        while(!checkInt(input))
        {
            System.out.println("You did not enter an int; try again: ");
            input = scan.next();
            checkInt(input);
        }
        while(!checkRange(Integer.parseInt(input)))
        {
            System.out.println("Enter an int between 1 and 9, inclusive: ");
            input = scan.next();
            checkRange(Integer.parseInt(input));
        }
        //check that the input is in the correct range
        int value = Integer.parseInt(input);
        return value;
    }
    
    public static boolean checkInt(String input)
    {
        Scanner scan = new Scanner(input);
        if(scan.hasNextInt())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean checkRange(int m)
    {
        if((m < 1) || (m > 9))
        {
            return false;
        }
        return true;
    }
    
    public static void allBlocks(int numBlocks)
    {
        for(int i = 1; i <= numBlocks; i++)
        {
            block(i);
        }
    }
    
    public static void block(int num)
    {
        for (int i = 0; i < num; i++)
        {
            for (int j = 0; j < i; j++)
            {
                for (int k = 0; k < (2*num - 1); k++)
                {
                    System.out.print(num);
                }
                System.out.println();
            }
        }
        line(2*num - 1);
        System.out.println();
    }
        
    //accepts input variables from block() and solves b1a
    public static void line(int numOfLines)
    {
        for (int i = 0; i < numOfLines; i++)
        {
            System.out.print("-");
        }
    }
}