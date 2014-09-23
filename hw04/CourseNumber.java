/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, hw04: Program 3
//Due: September 23rd, 2014
//Version 1
//Objective: practice with selection statements, comparison operators,
//and Boolean expressions. 
//In this program, we want the user to enter a 6 digit course number 
//so that we can tell them what year and semester the course
//was offered at Lehigh. The first four digits can be between 
//1865 and 2014 (first year, now) and the last two can be either
//10, 20, 30 or 40 (representing the 4 possible times during the year
//the course could have been taken.)
//
//Set up the scanner
import java.util.Scanner;
//Define class
public class CourseNumber {
    //Define main method
    public static void main(String[] args) {
        //Create a scanner
        Scanner myScanner = new Scanner(System.in);
        
        //Have the user enter the semester
        System.out.println("Enter a six digit number giving the course semester- ");
        int courseSemester = myScanner.nextInt();
        
        //See if the number they entered was appropriate
        
        //First, declare the variable for the year:
        int year = courseSemester/100;
        
        //Next, check if the semester they entered was valid
        //Last two digits being 10 gives spring semester
        if(courseSemester % 100 == 10)
        {
            System.out.println("The course was offered in the Spring semester of "+year);
        }
        //Last two digits = 20 gives Summer 1 session
        else if(courseSemester % 100 == 20)
        {
            System.out.println("The course was offered in the Summer 1 semester of "+year);
        }
        //Last two digits = 30 gives summer 2
        else if(courseSemester % 100 == 30)
        {
            System.out.println("The course was offered in the Summer 2 semester of "+year);
        }
        //Last two digits = 40 gives fall
        else if(courseSemester % 100 == 40)
        {
            System.out.println("The course was offered in the Fall semester of "+year);
        }
        //Make sure user can't enter a semester before spring 1865
        else if(courseSemester < 186510)
        {
            System.out.println("The number was outside of the range [186510, 201440]");
        }
        //Make sure a user can't enter a semester after this one
        else if(courseSemester > 201440)
        {
            System.out.println("The number was outside of the range [186510, 201440]");
        }
        //Make sure the user enters a legitimate smemester
        else if((courseSemester % 100 != 10) || (courseSemester % 100 != 20) ||
            (courseSemester % 100 != 30) || (courseSemester % 100 != 40))
        {
            System.out.println((courseSemester%100)+" is not a legitimate semester");
        }
    }
}