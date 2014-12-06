////////////////////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, lab13
//Objective: practice array operations for ragged arrays, sorting
//
//Assignment: Create a 2d ragged array of 5 rows, row j = j*3+5 in length
//
public class RaggedArrays
{
    public static void main(String[] args)
    {
        int[][] myArray = new int[5][];
        myArray[0] = new int[5];
        myArray[1] = new int[8];
        myArray[2] = new int[11];
        myArray[3] = new int[14];
        myArray[4] = new int[17];
        
        System.out.println("The array before sorting");
        for(int row = 0; row < myArray.length; row++)
        {
            for(int column = 0; column < myArray[row].length; column++)
            {
                myArray[row][column] = (int)(Math.random() * 40);
            }
        }
        for(int row = 0; row < myArray.length; row++)
        {
            for(int column = 0; column < myArray[row].length; column++)
            {
                System.out.print(myArray[row][column] + " ");
            }
            System.out.println();
        }
        
        Array array = new Array();
        for(int i = 0; i < myArray.length; i++)
        {
            array.sort(myArray[i]);
            System.out.println(myArray[i]);
        }
        
        
    }
}