package operator;
import java.util.Scanner;
public class ArithmeticOperators
{
	public static void main(String[] args)
	{   //Scanner class to take user input 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num1=sc.nextInt();
		System.out.println("Enter another number:");
		int num2=sc.nextInt();
		//Arithmetic operators
		System.out.println("Sum:"+(num1+num2));
		System.out.println("Subtraction:"+(num1-num2));
		System.out.println("Multiplication:"+(num1*num2));
		System.out.println("Division:"+(num1/num2));
		System.out.println("Modulus:"+(num1%num2));
}
}
