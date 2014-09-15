/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE 002 HW 03
//Due 9/16/14
//Practice in writing code that allows user to input data, 
//practice in performing arithmetic operations. This program
//asks the user to input the number of counts on a cyclometer
//and the number of seconds that occurred during those counts, 
//and then spits out how far they traveled, how long it took,
//and what their average speed was.
import java.util.Scanner;
public class Bicycle {
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //Enter number of seconds
        System.out.println("Enter the number of seconds:");
        int numberSeconds = input.nextInt();
        //Enter number of counts
        System.out.println("Enter the number of counts:");
        int numberCounts = input.nextInt();
        //Input variables
        double wheelDiameter = 27.0;
        double PI = 3.14159;
        int feetPerMile = 5280;
        int inchesPerFoot = 12;
        int secondsPerMinute = 60;
        int minutesPerHour = 60;
        //Calculate distance
        double distanceTrip = Math.round(numberCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile*100.00)/100.00;
        //Gives the distance in miles
        double timeTrip = numberSeconds/secondsPerMinute;
        System.out.println("The distance was "+distanceTrip+" miles and took "+timeTrip+" minutes.");
        double avgMilesPerHour = Math.round((distanceTrip/timeTrip)*minutesPerHour*100.00)/100.00;
        System.out.println("The average mph was "+avgMilesPerHour);
    }
}