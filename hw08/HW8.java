/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, hw08
//Due: October 28, 2014
//Version 1
//Objective:Practice writing methods, overloading methods, and
//forcing the user to enter good input
//
//Assignment: Add definitions to three overloaded versions of getInput(),
//so the program produces the correct output

import java.util.Scanner;

public class HW8 
{
    
    public static void main(String []arg) 
    {
        
        char input;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan,"Cc");
        System.out.println("You entered "+input);
        
        System.out.print("Enter 'y', 'Y', 'n', or 'N'-");
        input=getInput(scan,"yYnN",5); //give up after 5 attempts
        if(input!=' ') 
        {
            System.out.println("You entered "+input);
        }
        
        input = getInput(scan, "Choose a digit.","0123456789");
        System.out.println("You entered "+input); 
    }
    
    public static char getInput(Scanner scan, String word) 
    {
        
        String input = scan.next();
        
        while(input.length() > 1)
        {
            System.out.println("You should enter exactly one character-");
            input = scan.next();
        }
        
        while(true)
        {
            char lett = input.charAt(0);
            for(int i = 0; i < word.length(); i++)
            {
                if(lett == word.charAt(i))
                {
                    return lett;
                }
            }

            System.out.println("You did not enter a character from the list 'Cc'; try again-");
            input = scan.next();
            
            while(input.length() > 1)
            {
                System.out.println("You should enter exactly one character-");
                input = scan.next();
            }
        }
    }
    
    public static char getInput(Scanner scan, String word, int i)
    {
        
        String input = scan.next();
        char end = ' ';
        
            while (input.length() > 1)
            {
                System.out.println("You should enter exactly one character- ");
                i--;                
                if (i == 0)
                {
                    System.out.println("You failed after 5 tries.");
                    return end; 
                }
                input = scan.next();


            }
            
            while(true)
            {
                char lett = input.charAt(0);
                for (int j = 0; j < word.length(); j++)
                {
                    if (lett == word.charAt(j))
                    {
                        return lett; 
                    }
                }
                
                System.out.print("You did not return a character from the list 'yYnN'; ");
                System.out.print("try again- ");
                
                i--;
                if (i == 0)
                {
                    System.out.println("You failed after 5 tries");
                    return end; 
                }
                input = scan.next();
                
                while (input.length() > 1)
                {
                    System.out.println("You should enter exactly one character- ");
                    
                    i--;
                    if (i == 0)
                    {
                        System.out.println("You failed after 5 tries");
                        return end;
                    }
                    input = scan.next();
            }
        }
    }
    
    public static char getInput(Scanner scan, String command, String options)
    {
        while (true)
        {
            System.out.println(command);
            System.out.println("Enter one of: ");
            for (int i = 0; i < options.length(); i++)
            {
                System.out.print("'"+options.charAt(i)+"' , ");
            }
            String input = scan.next();
            
            
            while (input.length() > 1)
            {
                System.out.println("Enter exactly one character");
                input = scan.next();
            }
            
                char lett = input.charAt(0);
                for (int i = 0; i < options.length(); i++)
                {
                    if (lett == options.charAt(i))
                    {
                        return lett;
                    }
                }
                System.out.println("You did not enter an acceptable character");
                input = scan.next();
                
                while (input.length() > 1)
                {
                    System.out.println("Enter exactly one character");
                    input = scan.next();
                }
            
        }
    }
}



    