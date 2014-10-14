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
        int count = 0;
        int guessNumber = (int)(1 + Math.random() * 39);
        while (count < 100) 
        {
            int rouletteNumber = (int)(1 + Math.random() * 39);
            if (guessNumber == rouletteNumber) 
            {
                boolean match = true;
            }
            else
            {
                boolean match = false;
            }
        }
    }
}