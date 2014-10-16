/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, hw05, Program #2
//October 14, 2014
//Version 1
//Objective: practice writing loops
//Assignment: Have the user enter a double, use loops to 
//print out the closest estimation to the square root
//
import java.util.Scanner;

public class Root {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a double");
        //declare variables
        double x = scan.nextDouble(); //x is the number user enters
        double low = 0; //initialize the low off at 0, as stated
        double high = (1 + x); //initialize the high at the number they entered +1, as stated
        double middle = 0; //initalize middle
        while ((high-low) > (0.0000001 * (1+x)))
        {
            middle = (low + high)/2;
            if((middle * middle) > x)
            {
                high = middle;
            }
            else
            {
                low = middle; 
            }
        }
        //print the square root after all conditions have been met (the last high while
        //the while loop is still running under the stated condition will be the answer you
        //want)
        System.out.println("The square root is "+high+".");
    }
}
