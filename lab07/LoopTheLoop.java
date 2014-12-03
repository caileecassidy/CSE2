//Cailee Cassidy
//CSE002, Lab07 - LoopTheLoop
//October 8th, 2014
//Version 1
//Objective: to use while loops and a break statement. 
//We will be printing out a number of stars (*) using
//these new types of commands

//set up scanner
import java.util.Scanner;
//Define class
public class LoopTheLoop {
    //main method
    public static void main(String[] args) {
        
        int nStars = 10;

        while(true)
        {
            System.out.println("Enter an int between 1 and 15 - ");        
            //Create a scanner
            Scanner scan = new Scanner(System.in);
            
            if(scan.hasNextInt())
            {
                nStars = scan.nextInt();
            }
            else
            {
                return;
            }
            
            if(nStars < 1 || nStars > 15)
            {
                System.out.println("Your int was not in the range [1.15]");
                return;
            }
        
            for(int i = 0; i < nStars; i++)
            {
                System.out.print("*");
            }
            System.out.println();
            
            for(int i = 0; i < nStars; i++)
            {
                for(int j = 0; j <= i; j++)
                {
                    System.out.print("*");   
                }
                System.out.println();
            }
            
            System.out.println("Enter y or Y to go again - ");
            String answer = scan.next();
            if(answer.equals("y") || answer.equals("Y"))
            {
                 continue;
            }
            else
                 break;
        } 
    }
}