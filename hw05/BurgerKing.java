/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, hw05, Program #1
//September 30, 2014
//Version 1
//Objective: to practice using seleciton statements, operators, and
//boolean expressions. (Switch is preferred to a sequence of if statements
//with multiple selections)
//Assignment: Prompt the user to enter a choice of burger, soda, or fries,
//and then get details of their choices.
//
//Set up the scanner so you can make one later
import java.util.Scanner;
//Define class
public class BurgerKing {
    
    public static void main(String[] args) {
        //Create a scanner
        Scanner myScanner = new Scanner(System.in);

        //Ask user to enter their order
        
        System.out.println("Enter a letter to indicate a choice of");
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.println("Fries (F or f)");
        String order = myScanner.next();
        
            
            //First, make sure that they put in a single character
            if(order.length() != 1)
            {
                System.out.println("a single character is expected");
            }
            
            //If they select a burger, offer them different options of how they want a burger
            else if(order.equals("B") || (order.equals("b")))
            {
                System.out.println("Enter A or a for \"all the fixins\"");
                System.out.println("C or c for cheese");
                System.out.println("N or n for none of the above");
                String burgerDetails = myScanner.next();
            
                //Make sure they entered a single character when deciding about their burger
                if(burgerDetails.length() != 1)
                {
                    System.out.println("a single character is expected");
                }
                //Now that that is verified, tell them what they ordered
                else if(burgerDetails.equals("A") || (burgerDetails.equals("a")))
                {
                    System.out.println("You ordered a burger with all the fixins");               
                }
                else if(burgerDetails.equals("C") || (burgerDetails.equals("c")))
                {
                    System.out.println("You ordered a burger with cheese");
                }
                else if(burgerDetails.equals("N") || (burgerDetails.equals("n")))
                {
                    System.out.println("You ordered a burger");
                }
                else
                {
                    System.out.println("You did not enter any of A, a, C, c, N, or n");
                    return;
                }
            }
            
            //Now, if they picked soda, offer soda options
            else if(order.equals("S") || (order.equals("s")))
            {
                System.out.println("Do you want Pepsi (p or P),");
                System.out.println("Coke (c or C), Sprite (s or S), or Mountain Dew (M or m)");
                String sodaDetails = myScanner.next();
                
                //Make sure they entered one character
                if(sodaDetails.length() != 1)
                {
                    System.out.println("a single character is expected");
                }
                //Now tell them what kind of soda they ordered
                else if(sodaDetails.equals("P") || (sodaDetails.equals("p"))) 
                {
                    System.out.println("You ordered a Pepsi");
                }
                else if(sodaDetails.equals("C") || (sodaDetails.equals("c")))
                {
                    System.out.println("You ordered a Coke");
                }
                else if(sodaDetails.equals("S") || (sodaDetails.equals("s")))
                {
                    System.out.println("You ordered a Sprite");
                }
                else if(sodaDetails.equals("M") || (sodaDetails.equals("m")))
                {
                    System.out.println("You ordered a Mountain Dew");
                }
                else
                {
                    System.out.println("You did not enter any of P, p, C, c, S, s, M, or m");
                }
            }
            
            //Now give them the options if they ordered fries
            else if(order.equals("F") || (order.equals("f")))
            {
                System.out.println("Do you want a large or small order of fries (l, L, s, or S)");
                String friesDetails = myScanner.next();
            
                //make sure that they only entered one digit
                if(friesDetails.length() != 1)
                {
                    System.out.println("a single character is expected");
                }
                //give them size options for their fries
                else if(friesDetails.equals("L") || (friesDetails.equals("l")))
                {
                    System.out.println("You ordered large fries");
                }
                else if(friesDetails.equals("S") || (friesDetails.equals("s")))
                {
                    System.out.println("You ordered small fries");
                }
                else
                {
                    System.out.println("You did not enter any of L, l, S, or s");
                }
            }
        else 
        {
            System.out.println("You did not enter any of B, b, s, s, F, or f");
        }
    }
}    