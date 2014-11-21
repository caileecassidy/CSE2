/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, hw10
//Due: November 17, 2014
//Version 1
//Objective: practice manipulating arrays and writing methods that
//have array parameters
//
//Assignment: Program 2-generate random poker hands, and see if
//the user wants to generate a different hand
//
import java.util.Random;
import java.util.Scanner;
public class PokerOdds 
{
    public static void main(String [] arg) 
    {
        showHands();
        //simulateOdds();
    }

    public static void showHands()
    {
        Scanner scan = new Scanner(System.in);
        String answer = "";
        do
        {
            Random chooseRandom = new Random();
            int[] cards = new int[52];
            String suits [] = {"Clubs: ", "Diamonds: ", "Hearts: ",
              "Spades: "};
            String ranks [] = {"A", "K", "Q", "J", "10", "9", "8", "7", "6",
              "5", "4", "3", "2"};
            
            
            for(int i = 0; i < cards.length; i++)
            {
                cards[i] = i; 
            }
            
            int[] hand = new int[5];
            for(int i = 0; i < hand.length; i++)
            {
                hand[i] = -1;
            }
            
            for(int i = 1; i < 6; i++)
            {
                int card = chooseRandom.nextInt(52 - i);
                hand[i - 1] = card;
                cards[card] = cards[cards.length - i];
                cards[cards.length - i] = -1;
                String suit = suits[cards[i] / 13];
                String rank = ranks[cards[i] % 13];
            
                System.out.println(suits[0]+rank[suits[0]]);
                System.out.println(suits[1]+rank[suits[1]]);
                System.out.println(suits[2]+rank[suits[2]]);
                System.out.println(suits[3]+rank[suits[3]]);
            }
            System.out.println();
            System.out.println();
            System.out.println("Go again? Enter 'y' or 'Y', anything else to quit");
            
            answer = scan.next();
            
        } while(answer.equals("Y")||answer.equals("y"));
    }
}