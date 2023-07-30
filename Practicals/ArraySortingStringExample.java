package array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;
public class ArraySortingStringExample
{
	public static void main(String[] args) 
	{
		//Scanner class used to take user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int s=sc.nextInt();
		//declaring an String array with user input
		String[] arr=new String[s];
		System.out.println("Enter the array element:");
		//for loop
		for(int i=0;i<s;i++)
		{
			arr[i]=sc.next();
		}
		//Arrays.sort() method is used for sorting an array in ascending order
        Arrays.sort(arr);
        System.out.println("Sorted array:");
        //for-each loop used 
        for(String i:arr)
        {
    	  System.out.print(i+" ");
        }
        sc.close();
    
	}

}
