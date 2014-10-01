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
        
        //declare variables
        char B = 0;
        char b = 0;
        char S = 0;
        char s = 0;
        char F = 0;
        char f = 0;
        char A = 0;
        char a = 0;
        char C = 0;
        char c = 0;
        char N = 0;
        char n = 0;
        char P = 0;
        char p = 0;
        char M = 0;
        char m = 0;
        char L = 0;
        char l = 0;

        //Ask user to enter their order
        
        System.out.println("Enter a letter to indicate a choice of");
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.println("Fries (F or f)");
        String order = myScanner.next();
        
        if(order.equals('B') || order.equals('b') || order.equals('S') || order.equals('s') || order.equals('F') || order.equals('f'))
        {
            //If the customer orders a burger, offer them pssibilities of how they want it
            if(order.equals('B') || order.equals('b'))
            {
                System.out.println("Enter A or a for \"all the fixins\"");
                System.out.println("C or c for cheese");
                System.out.println("N or n for none of the above");
                String burgerDetails = myScanner.next();
            
                if(burgerDetails.equals('A') || burgerDetails.equals('a'))
                {
                    System.out.println("You ordered a burger with all the fixins");               
                }
                else if(burgerDetails.equals('C') || burgerDetails.equals('c'))
                {
                    System.out.println("You ordered a burger with cheese");
                }
                else if(burgerDetails.equals('N') || burgerDetails.equals('n'))
                {
                    System.out.println("You ordered a burger");
                }
                else
                {
                    System.out.println("You did not enter any of A, a, C, c, N, or n");
                    return;
                }
            }
            else if(order.equals('S') || order.equals('s'))
            {
                System.out.println("Do you want Pepsi (p or P),");
                System.out.println("Coke (c or C), Sprite (s or S), or Mountain Dew (M or m)");
                String sodaDetails = myScanner.next();
                
                if(sodaDetails.equals('P') || sodaDetails.equals('p')) 
                {
                    System.out.println("You ordered a Pepsi");
                }
                else if(sodaDetails.equals('C') || sodaDetails.equals('c'))
                {
                    System.out.println("You ordered a Coke");
                }
                else if(sodaDetails.equals('S') || sodaDetails.equals('s'))
                {
                    System.out.println("You ordered a Sprite");
                }
                else if(sodaDetails.equals('M') || sodaDetails.equals('m'))
                {
                    System.out.println("You ordered a Mountain Dew");
                }
                else
                {
                    System.out.println("You did not enter any of P, p, C, c, S, s, M, or m");
                }
            }
            else if(order.equals('F') || order.equals('f'))
            {
                System.out.println("Do you want a large or small order of fries (l, L, s, or S)");
                String friesDetails = myScanner.next();
            
                if(friesDetails.equals('L') || friesDetails.equals('l'))
                {
                    System.out.println("You ordered large fries");
                }
                else if(friesDetails.equals('S') || friesDetails.equals('s'))
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
                System.out.println("You did not enter any of B, b, S, s, F, or f");
            }
        }
        else 
        {
            System.out.println("You did not enter any of B, b, s, s, F, or f");
        }
    }
}    