package array;

import java.util.Scanner;

public class ArrayEx
{
    public static void main(String[]args)
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
		 System.out.println("The array is:");
		 for(int i=0;i<a.length;i++)
		 {
			
			System.out.println(a[i]);
		 }
		 //logic for remove even numbers
		 System.out.println("Modified array:");
		 for(int i=0;i<a.length;i++)
		 {
			 
			 if(a[i]%2!=0)
			 {
				
				System.out.println(a[i]);
			 }
		 }
		 
		
	
   
}
}