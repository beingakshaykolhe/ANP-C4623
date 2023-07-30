package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReversingArray
{
	 public static void main(String[]args)
     {
		 //take user input
    	 Scanner sc=new Scanner(System.in);
    	//declaring an integer array with size 5
    	 int[] a=new int[5];
		 System.out.println("Enter 5 numbers");
		 for(int i=0;i<a.length;i++)
		 {
			 a[i]=sc.nextInt();

		 }
		 System.out.println("Original array:");
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);

		 }
		 //logic for reversing array
		 System.out.println("Reverse array:");
		 for(int i=a.length-1;i>=0;i--)
		 {
			 System.out.println(a[i]);

		 }
   
		 
    
     }
    	 
     }

