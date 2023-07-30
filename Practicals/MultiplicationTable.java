package corejava;

import java.util.Scanner;

public class MultiplicationTable
{
	

	public static void main(String[] args)
	{
		        //Creating a scanner class to take input from user
				Scanner sc=new Scanner(System.in); 
				System.out.println("Enter the number");
				
				//creating a variable using scanner class object
				int number=sc.nextInt();
				
				int i;
				for(i=1;i<=10;i++)
				{
					
					
					System.out.println(number+"*"+i+"="+number*i);
					
				}

	}

}
