package corejava;

import java.util.Scanner;

public class IfElseExample
{

	public static void main(String[] args) 
	{
		//creating scanner class to take user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		//creating a variable using scanner class object
		int number=sc.nextInt();
		
		//checking condition
		if(number>0)
		{
			System.out.println("the number is positive");
		}
		else if(number<0)
		{
			System.out.println("the number is negative");
		}
		else
		{
			System.out.println("the number is zero");
		}
	}

}
