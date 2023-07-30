package corejava;

import java.util.Scanner;

public class WhileLoopExample
{

	public static void main(String[] args)
	
	{
		int i=2;
		//Scanner class to take user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		System.out.println("List of even numbers:");
		
		while(i<=number)
		{
			System.out.println(i);
			i=i+2;
			
			
		}
		
		

	}

}
