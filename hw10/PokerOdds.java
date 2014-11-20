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
        simulateOdds();
    }
}

public static void showHands()
{
    Random random = new Random();
    int[] cards = new int[52];
    for(int i = 0; i < cards.length; i++)
    {
        cards[i] = i; 
    }
}