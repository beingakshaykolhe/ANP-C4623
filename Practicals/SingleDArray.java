package array;

import java.util.Scanner;

public class SingleDArray
{

	public static void main(String[] args)
	{
		//scanner class to take user input
		 Scanner sc=new Scanner(System.in);
		 //declaring an integer array with size 5
		 int[] a=new int[5];
		 System.out.println("Enter 5 numbers");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 //printing values of array
		 System.out.println("Array elements are:");
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println("Element at index "+i+":"+a[i]);
		 }

	}

}
