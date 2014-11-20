import java.util.Scanner;
public class Practice 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please...");
        int input = scan.nextInt();
        while(input < 0 || input > 7)
        {
            System.out.println("Not a day");
            input = scan.nextInt();
        }
        while(input == 0)
        {
            break;
        }
        convertToDay(input);
    }
    public static int convertToDay(int input)
    {
        switch(input)
        {
            case(1): System.out.println("Monday"); break;
            case(2): System.out.println("Tuesday"); break;
        }
        return input;
    }
}
