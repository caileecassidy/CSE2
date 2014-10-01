/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, lab04
//September 17, 2014
//Version 1
//Objective: using selection statements to run code only under 
//specific conditions. 
//Assignment: use scanner to obtain info from users about how
//many Big Macs they want, and if they want fries with their order
//as well. 
//
import java.util.Scanner;
//Define class
public class BigMacAgain {
    
    public static void main(String[] args) {
        
        //Create a scanner
        Scanner myScanner = new Scanner(System.in);
        
        //Enter the number of Big Macs you want
        System.out.println("Enter the number of Big Macs: ");
        int numberBigMacs = myScanner.nextInt();
        
        //Check whether the user inputs an integer (use Scanner method 
        //hasNextInt(), returns a Boolean. If method returns true, int is next.
        //If it returns false, print error message, then return
        //In lab: doesn't have { after if, but it needs to be there!
        //In lab: says if(myScanner.hasNextInt()) -> earlier I defined myScanner
        //as input based on a past assignment, but they need to be defined 
        //the same (in the scanner and when you're using it)
        
        if(myScanner.hasNextInt()) 
        {
            System.out.println("You ordered "+numberBigMacs+" Big Macs for a cost of "
            +numberBigMacs+"x2.22 = $"+numberBigMacs*2.22);
        }
        else 
        {
            System.out.println("You did not enter an int");
            return;     //leaves the program, i.e. program terminates
        }
        //Now validate whether that integer was greater than 0
        
        if(myScanner.nextInt() > 0) 
        {
            System.out.println("You ordered "+numberBigMacs+" Big Macs for a cost of "
            +numberBigMacs+"x2.22 = $"+numberBigMacs*2.22);
        }
        else 
        {
            System.out.println("You did not enter an int > 0");
            return;     //program terminates
        }
        //If user enters an integer > 0, ask if they want fries as well
        //INFO FOR ME: int=nextInt, double=nextDouble, string=next

        System.out.println("Do you want an order of fries (Y/y/N/n)?");
        String orderFries = myScanner.next();
        //INFO FOR ME: string.equals("String") 
        //Use double pipe (||) for or, not commas

        if(orderFries.equals('Y') || orderFries.equals('y')) 
        {
            System.out.println("You ordered fries at a cost of $2.15");
        }
        else if(orderFries.equals('N') || orderFries.equals('n')) 
        {
           
        }
        else 
        {
            System.out.println("You did not give a valid answer");
            return;     //program terminates
        }
        
        System.out.println("The total cost of the meal is $"+(numberBigMacs*2.22)
        +2.15);
    }    //end of main method
}   //end of class