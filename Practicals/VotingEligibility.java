package corejava;

import java.util.Scanner;

public class VotingEligibility
{

	public static void main(String[] args) 
	{
		//Creating a scanner class to take input from user
        Scanner sc= new Scanner(System.in);
		System.out.println("Enter the age");
		
		//creating a variable using scanner class object
		int age=sc.nextInt(); 
		
		//Checking condition
		if(age>=18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println(" Not eligible for vote");
		}
		
		

	}

}
