////////////////////////////////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE 002 HW 03
//Due 9/16/14
//Practice in writing code that allows user to input data, 
//practice in performing arithmetic operations. This program
//asks the user to input a number and then estimates the cube root,
//then cubes it again and gives approximately the original value
//entered to double check.
import java.util.Scanner;
//Class
public class Root {
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //Enter the number you want 
        System.out.println("Enter a double, and I print its cube root: ");
        double chosenNumber = input.nextDouble();
        //First guess
        double firstGuess = chosenNumber/3;
        //Now set the variable for the second guess
        double secondGuess = (firstGuess*firstGuess*firstGuess + chosenNumber)/(3*firstGuess*firstGuess);
        //Variable for the third guess
        double thirdGuess = (2*secondGuess*secondGuess*secondGuess + chosenNumber)/(3*secondGuess*secondGuess);
        //Variable for the fourth and final guess, the one that 
        //will be given to the user
        double fourthGuess = (2*thirdGuess*thirdGuess*thirdGuess + chosenNumber)/(3*thirdGuess*thirdGuess);
        System.out.println("The cube root is "+fourthGuess);
        //Resquare the value to get
        double cubedValue = fourthGuess*fourthGuess*fourthGuess;
        System.out.println("The cube root cubed is "+cubedValue);
    }
}