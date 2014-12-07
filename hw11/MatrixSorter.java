/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, hw11
//Due: December 5, 2014
//Program 2
//
//Objective: practice manipulating arrays and multidimensional arrays 
//
//Assignment: return slabs, find the smallest entry in the array

import java.util.Random;

public class MatrixSorter
{
     public static int[][][] buildMat3d()
     {
          int mat3d[][][] = new int[3][][];
          mat3d[0] = new int[3][];
          mat3d[1] = new int[5][];
          mat3d[2] = new int[7][];
          
          for(int s = 0; s < mat3d.length; s++)
          {
               for(int j = 0; j < mat3d[s].length; j++)
               {
                    mat3d[s][j] = new int[(s+j+1)];
               }
          }
          
          Random randy = new Random();
          for(int s = 0; s < mat3d.length; s++)
          {
               for(int j = 0; j < mat3d[s].length; j++)
               {
                    for(int i = 0; i < mat3d[s][j].length; i++)
                    {
                         mat3d[s][j][i] = randy.nextInt(99) + 1;
                    }
               }
          }
          return mat3d;
     }
     
     public static void show(int mat3d[][][])
     {
          for(int s = 0; s < mat3d.length; s++)
          {
               System.out.print("---------------------------Slab " + (s + 1) + "\n");
               for(int j = 0; j < mat3d[s].length; j++)
               {
                    for(int i = 0; i < mat3d[s][j].length; i++)
                    {
                         System.out.print(mat3d[s][j][i] + " ");
                    }
                    System.out.println();
               }
          }
          System.out.print("--------------------------- \n");
     }
     
     public static int findMin(int mat3d[][][])
     {
          int min = mat3d[0][0][0];
          for(int s = 0; s < mat3d.length; s++)
          {
               for(int j = 0; j < mat3d[s].length; j++)
               {
                    for(int i = 0; i < mat3d[s][j].length; i++)
                    {
                         if(mat3d[s][j][i] < min)
                         {
                              min = mat3d[s][j][i];
                         }
                    }
               }
          }
          return min;
     }
     
     public static int[][] sort(int twoD[][])
     {
          for(int j = 0; j < twoD.length; j++)
          {
               selectionSort(twoD[j]);
          }
          insertionSort(twoD);
          return twoD;
     }
     
     public static int[] selectionSort(int oneD[])
     {
          int i, j, first, temp;  
          for (i = oneD.length - 1; i > 0; i--)  
          {
               first = 0;  
               for(j = 1; j <= i; j ++)  
               {
                    if(oneD[j] > oneD[first])         
                         first = j;
               }
               temp = oneD[first];   
               oneD[first] = oneD[i];
               oneD[i] = temp; 
          }
          return oneD;
     }
     
     public static int[][] insertionSort(int twoD[][])
     {
          int j;                    
          int[] key;            
          int i;  
          
          for (j = 1; j < twoD.length; j++)   
          {
               key = twoD[j];
               for(i = j - 1; (i >= 0) && (twoD[i][0] > key[0]); i--)  
               {
                    twoD[i + 1] = twoD[i];
               }
               twoD[i + 1] = key;   
          }
          return twoD;
     }
     

     public static void main(String[] args)
     {
          int mat3d[][][];
          mat3d = buildMat3d();
          show(mat3d);
          System.out.println("The smallest entry in the 3d matrix is " + findMin(mat3d));
          System.out.println("After sorting the 3rd matrix we get");
          sort(mat3d[2]);
          show(mat3d);
            
     }
}