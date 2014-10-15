/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, hw05, Program #2
//October 14, 2014
//Version 1
//Objective: practice writing loops
//Assignment: Use a random number generator to simulate the outcome of
//a roulette game on 100 spins
//
//set up scanner
import java.util.Scanner;
//Define class
public class Roulette {
    //Main method
    public static void main(String[] args) 
    {
        int countReps = 0; //declare variable for number of rounds of 100
        int guessNumber = 0; //declare a variable for the number to bet on
        int rouletteNumber = 0; //declare variable for the roulette number 
        int correctCount = 0; //declare variable to count the number of matches
        int repsLost = 0; //variable to ount number of reps of 100 out of 1000 where you lose everything
        int profit = 0; //variable that ounts profits in an individual round
        int totalTimesProfit = 0; //variable that counts number of times profited
        int totalProfit = 0; //variable that gives the actual profit in dollars
        while (countReps < 1000)
        {
            //generate the number that the dollar will be placed on
            guessNumber = (int)(1 + Math.random() * 39); 
            //specify that it will spin one hundred times
            for (int count = 0; count < 100; count++) 
            {
                rouletteNumber = (int)(1 + Math.random() * 39); //generate a roulette number
                if(guessNumber == rouletteNumber)
                {
                    correctCount++; //if you guess the right number, add one to the number of
                                    //times you guessed correctly
                }
            }
            profit = (correctCount * 36) - 100; //profit is the number of times you guessed
                                                //correctly times 36 dollars per "win", minus
                                                //the 100 you spent
            countReps++;
            totalProfit +=profit;
            correctCount=0;
            
            if(profit > 0) //aka if you guessed correctly 3 or more times, and you didn't lose any money
            {
                totalTimesProfit++;
            }
            else if(profit == -100) //if you lost all your money, profit will be -100
            {
                repsLost++;
            }
        }
        //part a: how many times out of 1000 you lost all 100 dollars you pu tdown
        System.out.println("For 1000 reps of 100 spins, you lost everything "+repsLost
        +" times.");
        //part b: the total winnings/losses from all 1000 rounds of 100 spins
        if(totalProfit>=0) //distinguish between whether you won or lost money
        {
            System.out.println("For 1000 reps of 100 spins, your total winnings were $"+
            totalProfit+".");
        }
        else if(totalProfit<0)
        {
            System.out.println("For 1000 reps of 100 spins, your total losses were $"+(-1*totalProfit)+".");
        }
        //part c: if you repeated this 100 spin cycle 1000 times, you would not lose money this number of times
        System.out.println("For 1000 reps of 100 spins, you walked away with a profit "+
        totalTimesProfit+" times.");
    }
}
   