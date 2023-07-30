package collectionframework;
import java.util.Scanner;
public class ExceptionExample
{
	public static void main(String[] args)
	{
		//Scanner class to take user input
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the first number");
		int num1=sc.nextInt();
		 System.out.println("Enter the another number");
		int num2=sc.nextInt();
		// write logic inside try block
		try {
		System.out.println("Sum:"+(num1+num2));
		System.out.println("Subtraction:"+(num1-num2));
		System.out.println("Multiplication:"+(num1*num2));
		System.out.println("Division:"+(num1/num2));
		System.out.println("Modulus:"+(num1%num2));
		}
		//catch block to handle NumberFormatException
		catch(NumberFormatException nfe)
		{
			System.out.println("please enter the  numberic value");
		}
		//catch block to handle ArithmeticException
		catch(ArithmeticException dbz)
		{
		  System.out.println("please enter non zero number");	
		}
		
}

}


