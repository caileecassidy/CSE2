import java.util.Scanner;
public class Practice 
{
    public static void main(String[] args)
    {
       System.out.println("[START]");
       for( int i = 1; i <=5; i++)
       {
           for( int j = 1; j<=i; j+=i)
           {
               System.out.println("["+i+"]");
           }
       }
       System.out.println("[END]");
    }
}
