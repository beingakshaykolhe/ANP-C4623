package corejava;

import java.util.Scanner;

public class WhileExample 
{
	
	public static void main(String[]args) 
	{
		int a;
		//creating scanner class to take user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number between 1 to 10");
	     a=sc.nextInt();
		while(a<1 || a>10)
		{
			System.out.println("Invalid input please enter a number between 1 and 10");
			System.out.println("Enter a number between 1 to 10");
			a=sc.nextInt();
		}
		System.out.println("You enter a number:"+a);
		
	}

}
