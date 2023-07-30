package array;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrayLab
{
    public static void main(String[] args) 
    {
    	//creating Scanner class to take user input 
        Scanner scanner = new Scanner(System.in);
        //take row input
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        //take column input
        System.out.print("Enter the number of columns: ");
        int numCols = scanner.nextInt();
         //create the array with the user specified dimensions
        int[][] array = new int[numRows][numCols];

        System.out.println("Enter the elements of the array:");
      //Get the values for array from user
        for (int i = 0; i < numRows; i++)
        {
            for (int j = 0; j < numCols; j++)
            {
                array[i][j] = scanner.nextInt();
            }
        }

        int[] rowSums = new int[numRows];
        int[] colSums = new int[numCols];

        for (int i = 0; i < numRows; i++) 
        {
            for (int j = 0; j < numCols; j++)
            {
                rowSums[i] += array[i][j];
                colSums[j] += array[i][j];
            }
        }
        //printing output of array
        System.out.println("The sum of each row is:");
        System.out.println(Arrays.toString(rowSums));

        System.out.println("The sum of each column is:");
        System.out.println(Arrays.toString(colSums));
    }
}
