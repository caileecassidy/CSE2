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
        
        {
            if(income >= 78) 
            {
                //For the first tax bracket, the highest amount of income: to get
                //the tax use the income, converted to a number that is actually in the thousands
                //and then a percentage is taken to give the tax on that income
                double tax1 = (income * 1000) * 0.14;
                //just tells the tax rate so we can print it later
                int taxRate1 = 14;
                System.out.println("The tax rate on $"+income+",000 is "+taxRate1+
                "%, and the tax is $"+(tax1 * 100)/100.0);
            }
            else if(income >= 40) 
            {
                //Second tax bracket, convert income to thousands and then take
                //percentage based on the given tax, which in this case is 12
                double tax2 = (income * 1000) * 0.12;
                int taxRate2 = 12;
                System.out.println("The tax rate on $"+income+",000 is "+taxRate2+
                "%, and the tax is $"+(tax2 * 100)/100.0);
            }
            else if(income >= 20) 
            {
                //Find tax
                double tax3 = (income * 1000) * 0.07;
                //Give tax rate
                int taxRate3 = 7;
                System.out.println("The tax rate on $"+income+",000 is "+taxRate3+
                "%, and the tax is $"+(tax3 * 100)/100.0);
            }
            else if(income >= 0) 
            { 
                //Find tax
                double tax4 = (income * 1000) * 0.05;
                //Give tax rate
                int taxRate4 = 5;
                System.out.println("The tax rate on $"+income+",000 is "+taxRate4+
                "%, and the tax is $"+(tax4 * 100)/100.0);
            }
            //Make sure that the number given is an integer
            else if(income * 10 % 10 != 0)
            {
                System.out.println("You did not enter an int");
            }
            //Make sure the inputted number is positive
            else if(income <0)
            {
                System.out.println("You did not enter a positive int");
            }
            else 
            {
                System.out.println("You did not enter a positive int");
            }
        }
    }
}
 