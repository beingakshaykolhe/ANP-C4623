package collectionframework;
import java.util.*;
import java.util.Iterator;

public class StackExample
{
	public static void main(String[] args)
	{
		Stack<String> st=new Stack<String>();
		//adding object in arraylist
		
		st.push("mango");
		st.push("banana");
		st.push("mango");
		st.push("orange");
		st.push("apple");
		st.pop();
		
		//traversing list to iterator
		Iterator itr = st.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}
}
