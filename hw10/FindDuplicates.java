/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, hw10
//Due: November 17, 2014
//Version 1
//Objective: practice manipulating arrays and writing methods that
//have array parameters
//
//Assignment: Program 1-check for duplicates in the input, both if 
//the input has duplicates and whether it has one or multiple
//

import java.util.Scanner;
public class FindDuplicates 
{
    public static void main(String [] arg) 
    {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[10];
        String answer = "";
        
        do
        {
            System.out.print("Enter 10 ints- ");
            
            for(int j = 0; j < 10; j++) 
            {
                num[j] = scan.nextInt();    
            }
            
            String out = "The array ";
            out += listArray(num);  //return a string of the form "{2, 3, -9}"
            
            if(hasDups(num)) 
            {
                out += "has ";    
            }
            
            else
            {
                out += "does not have ";
            }
            
            out += "duplicates.";
            System.out.println(out);
            out = "The array ";
            out += listArray(num);
            
            if(exactlyOneDup(num)) 
            {
                out += "has ";
            }
            
            else
            {
                out += "does not have ";
            }
            
            out += "exactly one duplicate.";
            System.out.println(out);
            
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit - ");
            answer = scan.next();
        }while(answer.equals("Y") || answer.equals("y"));
    }
    
    public static String listArray(int num[]) 
    {
        String out = "{";
        for(int j = 0; j < num.length; j++) 
        {
            if(j>0) 
            {
                out += ", ";
            }
            out += num[j];
        }
        out += "} ";
        return out;
    }
    
    public static boolean hasDups(int num[])
    {
        boolean hasDups = false;
        for(int j = 0; j < num.length; j++)
        {
            for(int k = j + 1; k < num.length; k++)
            {
                if(num[k] == num[j])
                {
                    hasDups = true;;
                }
            }
        }
        return hasDups;
    }
    
    public static boolean exactlyOneDup(int num[])
    {
        int duplicates = 0;
        for(int j = 0; j < num.length; j++)
        {
            for(int k = j + 1; k < num.length; k++)
            {
                if(num[k] == num[j])
                {
                    duplicates++;
                }
            }
        }
        if(duplicates == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}