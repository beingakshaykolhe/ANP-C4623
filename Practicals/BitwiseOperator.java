package operator;

import java.util.Scanner;

public class BitwiseOperator
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first No:");
	    int num1=sc.nextInt();
	    System.out.println("Enter the Second No:");
	    int num2=sc.nextInt();
	    //Apply bitwise AND operator
	    int and=num1 & num2;
	    System.out.println(num1 +"&"+num2+"="+and);
	    
	    //Apply bitwise OR operator
	    int or=num1 | num2;
	    System.out.println(num1 +"|"+num2+"="+or);	
	   
	    //Apply bitwise XOR operator
	    int xor=num1 ^ num2;
	    System.out.println(num1 +"^"+num2+"="+xor);
	   
	    //Apply bitwise NOT operator
	    int not1 =~ num1;
	    System.out.println("~"+num1+"="+not1);
	    int not2 =~ num2;
	    System.out.println("~"+num2+"="+not2);

	}

}
