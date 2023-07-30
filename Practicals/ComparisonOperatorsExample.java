package operator;
import java.util.Scanner;

public class ComparisonOperatorsExample
{

	public static void main(String[] args)
	{	
	    //Scanner class to take user input	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int num1=sc.nextInt();
		System.out.println("Enter another number ");
		int num2=sc.nextInt(); 
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		//Comparison operator
		if(num1==num2)
		{
			System.out.println(num1+"is equal to"+num2);
		}
		else if(num1>num2)
		{
			System.out.println(num1+"is greater than"+num2);
		}
		else if(num1<num2)
		{
			System.out.println(num1+"is less than"+num2);
		}
		else if(num1>=num2)
		{
			System.out.println(num1+"is greater than or equal to"+num2);
		}
		else if(num1<=num2)
		{
			System.out.println(num1+"is less than or equal to"+num2);
		}
		else
		{
			System.out.println(num1+"is not equal to"+num2);
		}
	}

}
