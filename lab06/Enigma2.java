import java.util.Scanner;
public class Enigma2
{
  public static void main(String [] arg)
  {
    int n=40,k=60;
    String out="";
    switch(n)
    {
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code
 * the first problem is that in case 40, you have to divide 40 by 0,
 * which is obviously not possible, so I took that out immediately. 
 * **don't really understand what the program is asking for**
 * 
 * 
 * 
 * 
 */
