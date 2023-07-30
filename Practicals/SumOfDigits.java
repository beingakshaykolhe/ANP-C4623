package corejava;

import java.util.Scanner;

public class SumOfDigits 
{
	public static void main(String[] args)
	{
		//fields
		int digit,sum=0,n;
		//scanner is used to take user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		//while loop
		while(n>0)
			{
			//logic to calculate sum of digits
			digit=n%10;
			sum=sum+digit;
			n=n/10;
			
			}
		System.out.println("Sum of digits:"+sum);

	}

}
