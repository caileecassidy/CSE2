///////////////////////////////////////////////////////////////////////////////////////////
//Cailee Cassidy
//September 10, 2014
//CSE 002 Lab03
//This program computes the cost of buying Big Macs 
//
//To use scanner, must import it before doing anything else
//
import java.util.Scanner;
public class BigMac {
//main method
    public static void main(String[] args) {
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        System.out.print(
            "Enter the number of big Macs(an integer>0):");
            int nBigMacs = myScanner.nextInt();
            System.out.print("Enter the cost per Big Mac as"+
            " a double (in the form xx.xx):");
            double bigMac$ = myScanner.nextDouble();
            System.out.print(
                "Enter the percent tax as a whole number (xx):");
                double taxRate = myScanner.nextDouble();
                taxRate/=100; //user enters percent, but i
                //want proportion
                double cost$;
                int dollars, dimes, pennies;    //dollars: whole dollar amount of cost
                                    //dimes, pennies: for storing digits to the right
                                    //of the decimal point for the
                                    //cost$
                cost$ = nBigMacs*bigMac$*(1+taxRate);
                //get the whole amount, dropping decimal fraction
                dollars=(int)cost$;
                //get dimes amount, e.g., (int)(6.73*10)%10 -> 67%10->7
                //where the % (mod) operator returns the remainder
                //after the division: 583%100 -> 83, 27%5->2
                dimes=(int)(cost$*10)%10;
                pennies=(int)(cost$*100)%10;
                System.out.println("The total cost of " +nBigMacs +" BigMacs, at $"
                +bigMac$ +" per bigMac, with a sales tax of " + (int)(taxRate*100)
                + "%, is $" +dollars+'.'+dimes+pennies);
    }
}