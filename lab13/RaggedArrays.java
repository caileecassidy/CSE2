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
        
        System.out.println("The array after sorting");
        for(int i = 0; i < myArray.length - 1; i++)
        {
            for(int j = 0; j < myArray[i].length - 1; j++)
            {
                double currentMin = myArray[i][j];
                int currentMinRowIndex = i;
                int currentMinColIndex = j;
            }
            
            for(int k = i + 1; k < myArray.length; k++)
            {
                for(int n = j + 1; n < myArray[i].length; n++)
                {
                    if(currentMin > myArray[k][n])
                    {
                        currentMin = myArray[k][n];
                        currentMinRowIndex = k;
                        currentMinColIndex = n;
                    }
                }
            }
            
            if(currentMinIndex != i)
            {
                myArray[currentMinIndex][] = myArray[i][];
                myArray[i] = currentMin;
            }
            for(int row = 0; row < myArray.length; row++)
            {
                for(int column = 0; column < myArray[row].length; column++)
                {
                    System.out.print(myArray[row][column] + " ");
                }
                System.out.println();
            }
        }
    }
}