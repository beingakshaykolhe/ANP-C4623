package collectionframework;
import java.util.*;
public class DequeExample {

	public static void main(String[] args) {
		
		   Deque<String> dq=new ArrayDeque<String>();
		   //adding elements using different methods
		   dq.add("Ball");
		   dq.addFirst("Apple");
		   dq.add("Cat");
		   dq.addLast("Dog");
		   
		   //printing elements
		   System.out.println("Elements are:" +dq);
		   
		   //remove & return the head of the deque
		   System.out.println("Removed element is:" +dq.pop());
		   
		  //remove & return the first element of the deque
		   System.out.println("Elements is:" +dq.pollFirst());
		   
		  //remove & return the last element of the deque
		   System.out.println("Elements is:" +dq.pollLast());
		   
		   


	}

}
