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
        //declare variables
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a double");
        double x = scan.nextDouble();
        double low = 0;
        double high = (1 + x);
        double middle = (low + high)/2;
        if((middle * middle) > x)
        {
            double newHigh = middle;
        }
        else
        {
           double newLow = middle; 
        }
    }
}
