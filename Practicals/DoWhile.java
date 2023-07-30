package corejava;

import java.util.Scanner;

public class DoWhile 
{
	
	public static void main(String[]args)
	{
		//Scanner to take user input
	Scanner sc= new Scanner(System.in);
	int n;
	do
	{
	
		System.out.println("Enter the positive number:");
		n=sc.nextInt();
		
	}
   while(n<=0);
   
	   int fact=1;
	 for(int i=1;i<=n;i++)
	 {
		 
	   fact*=i;
			   
   }
	 System.out.println(n+"!="+fact);
}
}

