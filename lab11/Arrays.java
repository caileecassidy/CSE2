////////////////////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, lab11
//Objective: practice with array operations
//

import java.util.Scanner;
public class Arrays 
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
    
        int[] myList = new int[10];
        System.out.println("Enter 10 ints - ");
        for(int i = 0; i < 10; i++)
        {
            myList[i] = scan.nextInt();
        }
        
        int max = myList[0];
        for(int i = 1; i < myList.length; i++)
        {
            if(myList[i] > max)
            {
                max = myList[i];
            }
        }
        System.out.println("The highest entry is "+max);
        
        int min = myList[0];
        for(int i = 1; i < myList.length; i++)
        {
            if(myList[i] < min)
            {
                min = myList[i];
            }
        }
        System.out.println("The lowest entry is "+min);
        
        int sum = 0;
        for(int i = 0; i < myList.length; i++)
        {
            sum += myList[i];
        }
        System.out.println("The sum is "+sum);
        
        int[] reverseList = new int[myList.length];
        for(int i = 0, j = myList.length - 1; i < myList.length; i++, j--)
        {
            reverseList[j] = myList[i];
            System.out.println(myList[i]+"   "+reverseList[i]);
        }

    }
}