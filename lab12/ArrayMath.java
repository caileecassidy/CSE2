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
public class ArrayMath
{
    public static void main(String [] arg)
    {
        double x[] = {2.3, 3, 4, -2.1, 82, 23},
        y[] = {2.3, 3, 4, -2.1, 82, 23},
        z[] = {2.3, 13, 14},
        w[] = {2.3, 13, 14, 12},
        v[], 
        u[] = {2.3, 12, 14};
        //v = addArrays(x,y);
        //System.out.println(display(x)+"\n + " + display(y) +
        //"\n = " + display(v));
        //System.out.println(display(x) + "\n + " + display(z) +
        //"\n = " + display(addArrays(x,z)));
        System.out.println("It is " + equals(x,y)+" that " +display(x) +
        " == " + display(y));
        System.out.println("It is " + equals(z,w) + " that " + display(z) +
        " == " + display(w));
        System.out.println("It is " + equals(u,z) + " that " + display(u) + 
        " == " + display(z));
    }
    
    public static String display(double[] x)
    {
        String out = "{";
        for(int j = 0; j < x.length; j++)
        {
            if(j > 0)
            {
                out += ", ";
            }
            out += x[j];
        }
        return out+"}";
    }
    
    public static boolean equals(double[] x, double[] y)
    {
        if(x.length!=y.length)
        {
            return false;
        }
        
        else if(x.length == y.length)
        {
            for(int i = 0; i < x.length; i++)
            {
                if(x[i]!=y[i])
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static double addArrays(double[] x, double[] y)
    {
        double[] z = new double[];
        double[] newX = new double[y.length];
        double[] newY = new double[x.length];
        
        if(x.length == y.length)
        {
            for(int i = 0; i < x.length; i++)
            {
                z[i] = x[i] + y[i];
            }
        }
        
        if(x.length < y.length)
        {
            double[] z = new double[y.length];
            for(int i = 0; i < x.length; i++)
            {
                newX[i] = x[i];
            }
            for(int i = x.length - 1; i < y.length; i++)
            {
                newX[i] = 0;        
            }
            
            for(int i = 0; i < y.length; i++)
            {
                z[i] = newX[i] + y[i];
            }
        }
        
        if(y.length < x.length)
        {
            double[] z = new double[x.length];
            for(int i = 0; i < y.length; i++)
            {
                newY[i] = y[i];
            }
            
            for(int i = y.length-1; i < x.length; i++)
            {
                newY[i] = 0;
            }
            
            for(int i = 0; i < x.length; i++)
            {
                z[i] = x[i] + newY[i];
            }
        }
    return z;    
    }
}