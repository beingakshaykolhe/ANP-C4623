package operator;

import java.util.Scanner;

public class AssignmentOperators 
{

	public static void main(String[] args)
	{   
		//Scanner class to take user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1=sc.nextInt();
		System.out.println("Enter second number :");
		int num2=sc.nextInt();
		System.out.println("Enter third number:");
		int num3=sc.nextInt();
		System.out.println("Enter forth number:");
		int num4=sc.nextInt();
		
		System.out.println("Initial value of num1="+num1);
		System.out.println("Initial value of num2="+num2);
		System.out.println("Initial value of num3="+num3);
		System.out.println("Initial value of num4="+num4);
		//Assignment operators
		
		num1+=num2;
		num2-=num1;
		num3*=num4;
		num4/=num3;		
		System.out.println("Final value of num1="+num1);
		System.out.println("Final value of num2="+num2);
		System.out.println("Final value of num3="+num3);
		System.out.println("Final value of num4="+num4);
        
	}

}
