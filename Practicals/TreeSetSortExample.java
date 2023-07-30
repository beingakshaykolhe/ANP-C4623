package collectionframework;
import java.util.*;
public class TreeSetSortExample 
{

	public static void main(String[] args)
	{
		   //declare treeset
		   TreeSet<String> ts=new 	TreeSet<String>();
			ts.add("b");
			ts.add("u");
			ts.add("k");
			ts.add("d");
			ts.add("a");
			//using descendingSet() method for reverse sorting
			TreeSet<String> tsreverse=(TreeSet<String>)ts.descendingSet();
			//printing output
			System.out.println("Sorted in reverse order:"+tsreverse);
			
		

	}

}
