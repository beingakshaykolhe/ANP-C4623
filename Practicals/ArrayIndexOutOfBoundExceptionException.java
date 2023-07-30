package collectionframework;

public class ArrayIndexOutOfBoundExceptionException
{
	
		
	     public static void main(String[] args)
	     {
	         // Declare and initialize an array with 5 elements
	         int[] n = { 1, 2, 3, 4, 5}; //index 0-4 ; total elements=5
	         try 
	         {
	             // Access the 6th element, which is out of bounds
	             int r= n[5];
	             System.out.println("The value is: " + r);
	         }
	         catch (ArrayIndexOutOfBoundsException e)
	         {
	             System.out.println("Caught an exception: " + e);
	         }
	     }
	 

}
