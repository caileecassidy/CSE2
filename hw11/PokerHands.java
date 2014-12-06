/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, hw11
//Due: December 5, 2014
//Program 2
//
//Objective: practice manipulating arrays and multidimensional arrays 
//
//Assignment: prompt the user to enter a 5 card hand, print the hand, 
//and then print the rank, aka "straight" 

import java.util.Scanner;
public class PokerHands
{
    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 'y' or 'Y' to enter a(nother) hand - ");
        String answer = scan.next();
        if(answer != "y" && answer != "Y")
        {
            System.out.println("You did not enter a valid response");
            return;
        }
        else if(answer == "y" || answer == "Y")
        {
            int count = 0;
            while(count < 5)
            {
                System.out.println("Enter the suit: 'c', 'd', 'h', or 's' - ");
                String suit = scan.next();
                if(suit != "c" && suit != "d" && suit != "h" && suit != "s")
                {
                    System.out.println("You did not enter a valid resposne");
                }
                else
                {
                    //hand[suit];
                }
                System.out.println("Enter one of 'a', 'k', 'q', 'j', '10',...'2' - ");
                String face = scan.next();
                if(face != "a" && face != "k" && face != "q" && face != "j" && face != "10" 
                   && face != "9" && face != "8" && face != "7" && face != "6" && face != "5"
                   && face != "4" && face != "3" && face != "2")
                {
                    System.out.println("You did not enter a valid response");
                }
                else
                {
                    //hand[face];
                }
                   
            }
        }
    }
    
    public static void showOneHand(int hand[])
    {
        String suit[] = {"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};
        String face[] = {"A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ",
          "5 ", "4 ", "3 ", "2 "};
        String out = "";
        
        for(int s = 0; s < 4; s++)
        {
            out += suit[s];
            for(int rank = 0; rank < 13; rank++)
            {
                for(int card = 0; card < 5; card++)
                {
                    if(hand[card]/13 == s && hand[card]%13 == rank)
                    {
                        out += face[rank];
                    }
                    out += '\n';
                }
            }
            System.out.println(out);
        }
    }
}