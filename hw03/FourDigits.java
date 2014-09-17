//////////////////////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE 002 HW 03
//Due 9/16/14
//Practice in writing code that allows user to input data, 
//practice in performing arithmetic operations. This program prompts
//the user to enter a double, then prints otu the first four digits
//to the right of the decimal. 
import java.util.Scanner;
public class FourDigits {
    public static void main(String[] args) {
        //Create a scanner
        Scanner input = new Scanner(System.in);
        //Enter a double
        System.out.println("Enter a double and I display the four digits to the right of the decimal point: ");
        double numberChosen = input.nextDouble();
        //The double is entered, now we get rid of the decimal
        int noMoreDecimals = (int)(numberChosen * 10000);
        //Now that there are no decimals we have to get rid of all original numbers before decimal
        int nextNumber = (int)(noMoreDecimals % 10000);
        System.out.println("The four digits are "+nextNumber);
        //Now, onto the second number
        System.out.println("Enter a double and I display the four digits to the right of the decimal point: ");
        double secondNumberChosen = input.nextDouble();
        //The second double is entered, and we get rid of the decimal
        int noMoreDecimalsTwo = (int)(secondNumberChosen *10000);
        //No decimals, we have to get rid of all original numbers before
        //the decimal, but this time we want to round up not down
        int digitOne = (int)(noMoreDecimalsTwo % 1);
        int digitTwo = (int)(noMoreDecimalsTwo % 1000)/100;
        int digitThree = (int)(noMoreDecimalsTwo % 100)/10;
        int digitFour = (int)(noMoreDecimalsTwo % 10)/1;
        System.out.println("The four digits are " + digitOne + digitTwo + digitThree + digitFour);
    }
}