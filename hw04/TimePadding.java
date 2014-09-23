/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, hw04: Program 4
//Due: September 23rd, 2014
//Version 1
//Objective: practice with selection statements, comparison operators,
//and Boolean expressions. 
//
//In this program we want the user to enter a positive integer that
//represents a number of seconds, and we will convert that to 
//a time in a conventional form, i.e. 02:24:51, or 14:02:20. 
//The main issue here is going to be the "padded zeroes"
//
//Set up the scanner
import java.util.Scanner;
//Define class
public class TimePadding {
    //Define main method
    public static void main(String[] args) {
    //Create a scanner
    Scanner myScanner = new Scanner(System.in);
    
    //Have the user enter the time
    System.out.println("Enter the time in seconds: ");
    int seconds = myScanner.nextInt();
    }
}
