/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, hw07
//Due: October 21, 2014
//Version 1
//Objective: get practice wriitn while, for, and do-while loops
//Assignment: have the user enter an integer between 1 and 9,
//inclusive, and print out display (depending on value entered)
//
//set up scanner
import java.util.Scanner;
//define class
public class NumberStack {
    //define main method
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 9 - ");
        
        int x = scan.nextInt(); //this is the number the user entered

        //make sure the number is between 0 and 9
        if(x<1) 
        {
            System.out.println("Not a valid input.");
            return;
        }
        else if(x>9) 
        {
            System.out.println("Not a valid input.");
            return;
        }
        
        //start the for loops
        System.out.println("Using for loops:");
        //the number of blocks
        for (int i = 1; i <= x; i++)
        {
            //the number of rows
            for (int j = 1; j <= i; j++)
            {
                //the number of time it prints a number in a row
                for (int k = 0; k < (2*i - 1); k++)
                {
                    System.out.print(i);
                }
                System.out.println();
            }
            for (int z = 0; z < (2*i - 1); z++)
            {
                System.out.print("-");
            }
            System.out.println();
        }
        //while loop
        System.out.println("Using while loops:");
        int i = 1;
        while (i <= x)
        {
            int j = 1;
            while (j <= i)
            {
                int k = 0;
                while (k < (2*i - 1))
                {
                    System.out.print(i);
                    k++;
                }
                System.out.println();
                j++;
            }
            int z = 0;
            while (z < (2*i - 1))
            {
                System.out.print("-");
                z++;
            }
            System.out.println();
            i++;
        }
        
        //do while 
        System.out.println("Using do-while loops:");
        
        i = 1;
        do {
            int j = 1;
            do {
                int k = 0;
                do {
                    System.out.print(i);
                    k++;
                } while (k < (2*i - 1));
                System.out.println();
                j++;
            } while (j <= i);
            int z = 0;
            do {
                System.out.print("-");
                z++;
            } while (z < (2*i - 1));
            System.out.println();
            i++;
        } while (i <= x);
    }
}