/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, hw05, Program #2
//September 30, 2014
//Version 1
//Objective: to practice using seleciton statements, operators, and
//boolean expressions. (Switch is preferred to a sequence of if statements
//with multiple selections)
//Assignment: Write a program that has three boolean variables to each of which the value
//of true or false is assigned randomly. Then, randomly, combine them with random choices of 
//&& and || and store the result - present the randomly generated set to the user and 
//prompt them to answer whether it has the value true or false. 
//
//Set up the scanner so you can make one later
import java.util.Scanner;
//Define class
public class BoolaBoola {
    
    public static void main(String[] args) {
        
        //declare variables
        boolean var1; 
        String var2;
        boolean var3;
        String var4;
        boolean var5;
        boolean answer1;
        boolean finalAnswer;
        
        if(Math.random() > 0.5)
        {
            var1 = true;
        }
        else
        {
            var1 = false;
        }
        
        if(Math.random() > 0.5)
        {
            var3 = true;
        }
        else
        {
            var3 = false;
        }
        
         if(Math.random() > 0.5)
        {
            var2 = "&&";
            answer1 = var1 && var3;
        }
        else
        {
            var2 = "||";
            answer1 = var1 || var3;
        }
        
        if(Math.random() > 0.5)
        {
            var5 = true;
        }
        else
        {
            var5= false;
        }
        
        if(Math.random() > 0.5)
        {
            var4 = "&&";
            finalAnswer = answer1 && var5;
        }
        else
        {
            var4 = "||";
            finalAnswer = answer1 || var5;
        }
        
        //Create a scanner
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Does "+var1+" "+var2+" "+var3+" "+var4+" "+var5+
        " have the value true(t/T) or false(f/F)?");
        
        String answer = myScanner.next();
        
        boolean userAnswer = false;
        
        if(answer.equals("F")  || (answer.equals("f")))
        {
            userAnswer = false;
        }
        else if(answer.equals("T") || (answer.equals("t")))
        {
            userAnswer = true;
        }
        
        if(userAnswer == finalAnswer)
        {
            System.out.println("Correct");
        }
        else
        {
            System.out.println("Wrong; try again");
        }
    }
}
        
        