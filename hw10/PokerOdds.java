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
        Random chooseRandom = new Random();
        int[] cards = new int[52];
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
        }
        
        switch(card % 13)
        {
            String rank = " ";
            case 0: rank = "A"; break;
            case 1: rank = "K"; break;
            case 2: rank = "Q"; break;
            case 3: rank = "J"; break;
            case 4: rank = "10"; break;
            case 5: rank = "9"; break;
            case 6: rank = "8"; break;
            case 7: rank = "7"; break;
            case 8: rank = "6"; break;
            case 9: rank = "5"; break;
            case 10: rank = "4"; break;
            case 11: rank = "3"; break;
            case 12: rank = "2"; break;
        }
        
        String [] labels = new String[5];
        
        
        //String labels [] = {"Clubs: ", "Diamonds: ", "Hearts: ",
          //"Spades: ");
        //for(int i = 0; i < 4; i++)
        //
        //{
          //System.out.println(labels[i] + )
        //} 
    }
}