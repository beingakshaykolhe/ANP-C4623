package corejava;

import java.util.Scanner;

public class SwitchExample
{

	public static void main(String[] args) 
	{
		//Creating scanner  to take user input
		Scanner sc= new Scanner(System.in);
		int n;
		//do while loop
		do
		{
			System.out.println("1.Option 1");
			System.out.println("2.Option 2");
			System.out.println("3.Option 3");
			System.out.println("4.Option 4");
			System.out.println("5.Option 5");
			System.out.println("6.Option 6");
			System.out.println("7.Option 7");
			System.out.println("Exit");
			System.out.println("Enter your choice:");
			n=sc.nextInt();
			//switch case 
			switch(n)
			{
			case 1:
				System.out.println("Monday.");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
			case 7:
				System.out.println("Sunday");
				break;
			case 8:
				System.out.println("Exit the option");
				break;
				
			default:
				System.out.println("Invalid choice,please try again.");
			
			}
		}
			while(n!=8);
	}

}
