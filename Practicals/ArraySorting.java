package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting 
{
	public static void main(String[] args) 
	{
		//Scanner class used to take user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int a=sc.nextInt();
		int[] arr=new int[a];
		System.out.println("Enter the array element:");
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
       Arrays.sort(arr);
       System.out.println("Sorted array:");
      for(int i:arr)
      {
    	  System.out.print(i+" ");
      }
     
	}

}

