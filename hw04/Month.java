/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, hw04: Program 2
//Due: September 23rd, 2014
//Version 1
//Objective: practice with selection statements, comparison operators,
//and Boolean expressions. 
//
//In this program, we will prompt the user to enter an integer for the month
//(1 is January, 2 is Feb, etc), and then we will display the number of 
//days in that month. Make sure the user enters an integer and it's in 
//the required range, aka from 1-12. Same goes for the year. 
//
//Set up the scanner
import java.util.Scanner;
//Define class
public class Month {
    //Define main method
    public static void main(String[] args) {
        //Create a scanner
        Scanner myScanner = new Scanner(System.in);
        
        //Have the user enter the number
        System.out.println("Enter an int giving the number of the month (1-12) -");
        int month = myScanner.nextInt();
        
        //if they select January    
        if(month == 1) 
        {
            System.out.println("The month has 31 days");
        }
        //March
        else if(month == 3) 
        {
            System.out.println("The month has 31 days");
        }
        //April
        else if(month == 4) 
        {
            System.out.println("The month has 30 days");
        }
        //May
        else if(month == 5) 
        {
            System.out.println("The month has 31 days");
        }
        //June
        else if(month == 6) 
        {
            System.out.println("The month has 30 days");
        }
        //July
        else if(month == 7) 
        {
            System.out.println("The month has 31 days");
        }
        //August
        else if(month == 8) 
        {
            System.out.println("The month has 31 days");
        }
        //September
        else if(month == 9) 
        {
            System.out.println("The month has 30 days");
        }
        //October
        else if(month == 10) 
        {
            System.out.println("The month has 31 days");
        }
        //November
        else if(month == 11) 
        {
            System.out.println("The month has 30 days");
        }
        //December
        else if(month == 12) 
        {
            System.out.println("The month has 31 days");
        }
        //February is last because it's special (leap years)
        else if(month == 2) 
        {
            System.out.println("Enter an int giving the year ");
            int year = myScanner.nextInt();
            //If the year is divisible by 4, it was a leap year
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
            {
                System.out.println("The month has 29 days");
            }
            //Making sure that the year they entered is positive
            else if(year < 0) 
            {
                System.out.println("You did not enter an int between 1 and 12");
            }
            //Make sure they enter an integer
            else if(year * 10 % 10 != 0)
            {
                System.out.println("You did not enter an int to give the year");
            }
            //If it's not a leap year, February has 28 days
            else
            {
                System.out.println("The month has 28 days");
            }
        }
        //Make sure they entered a positive number for the month
        else if(month < 1) 
        {
            System.out.println("You did not enter an int between 1 and 12");
        }
        //Make sure they only entered a number between 1 and 12
        else if(month > 12) 
        {
            System.out.println("You did not enter an int between 1 and 12");
        }
        //Make sure they entered an integer
        else if(month * 10 % 10 != 0)
        {
            System.out.println("You did not enter an int between 1 and 12");
        }
        //Covering for anything else they may have entered
        else
        {
        System.out.println("You did not enter an int between 1 and 12");
        }
    }
}
