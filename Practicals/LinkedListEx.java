package collectionframework;

//package for collection framework in java
import java.util.*;

public class LinkedListEx 
{
	//main method
	public static void main(String[] args)
	{
		LinkedList<Integer>list=new LinkedList<Integer>();
		//adding object in linked list
		
		list.add(45);
		list.add(76);
		list.add(56);
		list.add(89);
		list.add(45);
		//printing elements of linked list
		System.out.println("elements:"+ list);
		list.addFirst(3);
		System.out.println(list);
		list.addLast(5);
		System.out.println(list);
		System.out.println(list.contains(68));
		int h=list.peek();
        System.out.println("Head of linkedlist:"+h);

  	    //Removing the top element 
  	    System.out.println("Removed Element is:" + list.poll());
  	    System.out.println(list);
  	    System.out.println(list.size());

	}
}
