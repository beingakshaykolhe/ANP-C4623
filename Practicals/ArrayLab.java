package array;
import java.util.Scanner;
public class ArrayLab
{
	public static void main(String[] args)
	{
		int i,sum=0,product=1;
		//Scanner class to take user input
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		System.out.println("Elements of arrays are:");
	     //create the array
		int[] arr=new int[size];
	    //for loop that take array element 
		for( i=0;i<size;i++)  
		 {
			 arr[i]=sc.nextInt();
		 }
		//for loop for sum of even numbers in an array
		for( i=0;i<size;i++)
		{
		     if(arr[i]%2==0)
		     { 
			  sum=sum+arr[i];	
		     } 
		}
		System.out.println("Sum of an even numbers in an array:"+sum);
		//for loop for product of an odd numbers in an array
		for( i=0;i<size;i++)
		{
		      if(arr[i]%2!=0)
		      { 
			    product=product*arr[i];	
		      }
		}
		System.out.println("product of odd numbers in an array:"+product);
	}
}







