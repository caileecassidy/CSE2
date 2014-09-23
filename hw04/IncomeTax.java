/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, hw04: Program 1
//Due: September 23rd, 2014
//Version 1
//Objective: practice with selection statements, comparison operators,
//and Boolean expressions. 
//In this first program, we will prompt the user to enter an int 
//that gives the thousands of dollars of income, and then spits out
//the amount of tax they will pay.
//
//Set up the scanner so you can make one later
import java.util.Scanner;
//Define class
public class IncomeTax {
    
    public static void main(String[] args) {
        //Create a scanner
        Scanner myScanner = new Scanner(System.in);
        
        //Enter your income
        System.out.println("Enter an int giving the number of thousands- ");
        int income = myScanner.nextInt();
        
        //Compute tax
        
        double tax = 0;
        double taxRate = 0;
        
        if(myScanner.hasNextInt()) 
        {
            if (income >= 78) 
            {
                tax = (income * 1000) * 0.14;
                taxRate = 14;
            }
            else if (income >= 40) 
            {
                tax = (income * 1000) * 0.12;
                taxRate = 12;
            }
            else if (income >= 20) 
            {
                tax = (income * 1000) * 0.07;
                taxRate = 7;
            }
            else if (income >= 0) 
            { 
                tax = (income * 1000) * 0.05;
                taxRate = 5;
            }
            else if ((income * 10) % 10) != 0;
            {
                System.out.println("You did not enter an int");
            }
            else 
            {
                System.out.println("You did not enter a positive int");
            }
        System.out.println("The tax rate on $"+income+",000 is "+taxRate+"%, and the tax is $"+tax*100/100.0);
        }
    }
}
 