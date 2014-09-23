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
    }
}