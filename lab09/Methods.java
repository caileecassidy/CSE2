/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, lab09
//October 22, 2014
//Version 1
//Objective: Practice writing methods
//
//Assignment: 
//
import java.util.Scanner;

public class Methods{
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three ints");
        a = getInt(scan);
        b = getInt(scan);
        c = getInt(scan);
        System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
        System.out.println("The larger of "+a+", "+b+", and "+c+
            " is "+(larger(a, larger(b,c))));
        System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
            ", and "+c+" are in ascending order");
    }
}