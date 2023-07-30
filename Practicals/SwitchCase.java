package corejava;

import java.util.Scanner;

public class SwitchCase 
{

	public static void main(String[] args) 
	{
		//Scanner to take user input
		Scanner sc= new Scanner(System.in);
		int n;
		do
		{
			System.out.println("1.Option 1");
			System.out.println("2.Option 2");
			System.out.println("3.Option 3");
			System.out.println("Exit");
			System.out.println("Enter your choice:");
			n=sc.nextInt();
			switch(n)
			{
			case 1:
				System.out.println("you are selected option 1.");
				break;
			case 2:
				System.out.println("you are selected option 2.");
				break;
			case 3:
				System.out.println("you are selected option 3.");
				break;
			case 4:
				System.out.println("Exit the option");
				break;
			default:
				System.out.println("Invalid choice,please try again.");
			
			}
		}
			while(n!=4);
		}
	
				 

	}


