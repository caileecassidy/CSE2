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
        int secondsIn = myScanner.nextInt();
    
        //The user now enters the time in seconds
    
        //To get the seconds value that we are going to spit out:
        int secondsOut = secondsIn % 60;
        int minutesOut = secondsIn / 60 % 60;
        int hoursOut = secondsIn / 3600;
        
    
        if(secondsIn < 0)
        {
            System.out.println("Entry invalid. Enter a number between 0 and 86399.");
        }
        else if(secondsIn >= 86400)
        {
            System.out.println("Entry invalid. Enter a number between 0 and 86399.");
        }
        else if(secondsIn * 10 % 10 != 0)
        {
            System.out.println("Enry invalid. Enter an integer between 0 and 86399.");
        }
       
        if(secondsOut < 10 && minutesOut < 10)
        {
            System.out.println("The time is "+hoursOut+":0"+minutesOut+":0"+secondsOut+".");
        }
        else if(secondsOut < 10)
        {
            System.out.println("The time is "+hoursOut+":"+minutesOut+":0"+secondsOut+".");
        }
        else if(minutesOut < 10)
        {
            System.out.println("The time is "+hoursOut+":0"+minutesOut+":"+secondsOut+".");
        }
        else
        {
            System.out.println("The time is "+hoursOut+":"+minutesOut+":"+secondsOut+".");
        }
    }
}
