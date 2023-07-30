package collectionframework;
//package for collection framework in java
import java.util.*;

public class VectorEx
{
	//main method
	public static void main(String[] args)
	{
		Vector<String>v=new Vector<String>();
		
		//adding object in Vector
		v.add("mango");
		v.add("banana");
		v.add("mango");
		v.add("orange");
		v.add("apple");
		
		//traversing list to iterator
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}
}
