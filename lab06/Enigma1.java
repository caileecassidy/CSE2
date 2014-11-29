/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;

public class Enigma1
{
    public static void main(String []arg)
    {
        double percent;
        
        System.out.print("Enter a value for the percent (0, 1,...99)- ");
        double x=((new Scanner(System.in)).nextDouble());
        System.out.println("You entered "+x+"%");
        
        double proportion = 1-x/100;
        double fixedProportion = proportion * 100 / 100;
        System.out.println("The proportion remaining is "+ fixedProportion);
        
   
   }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 *    I was not getting any output initially from these if statements, so
 *    instead I changed it to a more universal format and just print out that
 *    the proportion remaining was 1-x/100. For some values, this would not truncate
 *    and would print out values that were close but not accurate, so i multiplied
 *    and then divided the result by 100, and now it prints out a two digit answer
 * 
 * 
 */