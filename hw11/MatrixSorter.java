/////////////////////////////////////////////////////////////////
//Cailee Cassidy
//CSE002, hw11
//Due: December 5, 2014
//Program 2
//
//Objective: practice manipulating arrays and multidimensional arrays 
//
//Assignment: return slabs, find the smallest entry in the array

public class MatrixSorter {
    public static void main(String arg[])
    {
        int mat3d[][][];
        mat3d = buildMat3d();
        show(mat3d);
        System.out.println("The smallest entry in the 3D matrix is " + 
          findMin(mat3d));
        System.out.println("After sorting the 3rd matrix we get");
        sort(mat3d[2]);
        show(mat3d);
    }
    
    public static int[][][] buildMat3d()
    {
        int[][][] mat3d = new int[3][][];
        mat3d[0] = new int[3][5];
        mat3d[1] = new int[5][8];
        mat3d[2] = new int[7][11];
        return mat3d;
    }
    
    public static int[][] show(int x[][][])
    {
        int[][] mat2d = new int[2][2]; //placeholder
        return mat2d;     //placeholder
    }
    
    public static int findMin(int x[][][])
    {
        return 7;   //placeholder 
    }
    
    public static int[][] sort(int x[][])
    {
        return x;  //placeholder  
    }
}