//Cailee Cassidy
//CSE002, Lab06-Enigma
//Due October ****
//Version 1
//Objective: we are given some code, and we want to 
//find the bugs *****

/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */
//Set up scanner
import java.util.Scanner;
//Define class
public class Enigma0 {
  //Originally said main(String arg []), changed  
  public static void main(String[] args) {
      
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter an int- ");

    
    if(scan.hasNextInt())
    {
        int n=scan.nextInt();
      System.out.println("You entered "+n);
      System.out.println("Please enter a second int- ");
    }
    else
    {
      int n=4;
      System.out.println("You entered "+n);
      System.out.println("Please enter a second int- ");
    }
    
    int k=4,p=6,q=7,r=8,n=scan.nextInt();
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
    }
  }
}

/* Error report:
 Expand this comment:
 Explain the error(s) that occurred here, and then fix them
 Firstly, this code was very compact and I find it easier to read if it
 is a bit more spaced out so I took care of that. 
 When I compiled the lab, the first error I got was "Error: Could not find or load
 main class Enigma0". I moved the creation of the scanner to before asking the user for input
 instead of after, and then upon recompiling got the error "variable n might not have been 
 initialized". To initialize this variable, it had to be declared in the line where k=4...etc,
 so i set it equal to scan.nextInt();
 On line 19 when declaring the main method it originally said
 "main(String arg [])", which I changed to "main(String[] args)" because
 it was originally incorrect. 
 At this point, the code now ran but it would instruct you to enter an integer
 (I entered 4, it printed "You entered 4" and nothing else). I then entered
 another integer (I entered 3) and it printed "sum is 25" and "To repeat,
 you entered 3". Initially I did not know what to do after it said "You entered 4"
 so I chose to put in another system.out.println instructing the user to 
 input a second integer. The reason that it printed both "sum is 25" and the 
 defalut was because there was no break statement, so I placed 
 one of those after case 25. The sum will always be 25
 */
 
