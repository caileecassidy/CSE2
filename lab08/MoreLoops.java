//////////////////////////////////////////////////////////
//Cailee Cassidy
//lab08
//CSE002
//Version 1

import java.util.Scanner;
public class MoreLoops
{
    public static void main(String[] arg)
    {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        
        /*System.out.print("Enter an int - ");
        while(!scan.hasNextInt())
        {
            scan.next();
            System.out.print("You did not enter an int; try again - ");
        }*/
        
        //CODE 1
        /*System.out.print("Enter an int - ");

        if(!scan.hasNextInt());
        {
            do
            {
                System.out.print("You did not enter an int; try again - ");
                scan.next();
            } while(!scan.hasNextInt());
        }*/
        
        //n = scan.nextInt();
        
        /*for(int j = 0; j < n && j < 40; j++)
        {
            for(int k = 0; k < j+1; k++)
            {
                System.out.print('*');
            }
            System.out.println();
        }*/
        
        //CODE 2
        /*int j = 0;
        while(j < n && j < 40)
        {
            int k = 0;
            while(k < j+1)
            {
                System.out.print('*');
                k++;
            }
            System.out.println();
            j++;
        }*/
        
        //int k = 4;
        
        /*do
        {
            System.out.println("k = "+k);
            k++;
        } while(k < 4); */
        
        //CODE 3
        /*while(k<=4)
        {
            System.out.println("k = "+k);
            k++;
        }*/
        
        int count = 0;
        while(true)
        {
            switch(n)
            {
                default: System.out.println(n+" is > 5 or < 1"); break;
                case 1:
                case 2: System.out.print("Case 2"); continue;
                case 3: break;
                case 4: System.out.println("Case 4");
                case 5: System.out.println("Case 5"); break;
            }
            count++;
            if(count < 10)
              break;
        }
    }
}