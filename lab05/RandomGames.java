/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, lab04
//September 24, 2014
//Version 1
//Objective: practice using switch statements and Math.random()
//
//Assignment: Prompt user to pick a game out of Roulette, Craps,
//or pickign a card from a deck. 
//
import java.util.Scanner; 
public class RandomGames
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter R or r for roulette, C or c for " +
          "craps, P or p for pick a card - ");
        String choice = scan.next();
        
        int rouletteDraw = (int)(Math.random() * 38);
        String rouletteResults;
        if(rouletteDraw == 37)
        {
            rouletteResults = "00";
        }
        else
        {
            rouletteResults = (rouletteDraw + "");
        }
        
        if(choice.length() > 1)
        {
            System.out.println("a single character expected");
        }
        switch (choice)
        {
            case "R": System.out.println(rouletteResults); break;
            case "r": System.out.println(rouletteResults); break;
            case "C": System.out.println("Craps is not implmeneted yet"); break;
            case "c": System.out.println("Craps is not implemented yet"); break; 
            case "P": System.out.println("Pick a card is not implemented yet"); break; 
            case "p": System.out.println("Pick a card is not implemented yet"); break; 
            default: System.out.println("'"+choice+"' is not one "+
              "of 'R', 'r', 'C', 'c', 'P', or 'p'"); break;
        }
    }
}