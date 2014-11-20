/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, lab12
//November 12, 2014
//Version 1
//Objective: Practice with elementary array operations and passing
//arrays to and from methods
//Assignment: Call two methods among a number that could
//be written to form arithmetic operations on arrays. You need to write the 
//code for equals() and addArrays(). 
//
public class arrayMath
{
    public static void main(String [] arg)
    {
        double x[] = {2.3, 3, 4, -2.1, 82, 23},
        y[] = {2.3, 3, 4, -2.1, 82, 83},
        z[] = {2.3, 13, 14},
        w[] = {2.3, 13, 14, 12},
        v[], 
        u[] = {2.3, 12, 14};
        v = addArrays(x,y);
        System.out.println(display(x)+"\n + " + display(y) +
        "\n = " + display(v));
        System.out.println(display(x) + "\n + " + display(z) +
        "\n = " + display(addArrays(x,z)));
        System.out.println("It is " + equals(x,y)+" that " +display(x) +
        " == " + display(y));
        System.out.println("It is " + equals(z,w) + " that " + display(z) +
        " == " + display(w));
        System.out.println("It is " + equals(u,z) + " that " + display(u) + 
        " == " + display(z));
    }
}