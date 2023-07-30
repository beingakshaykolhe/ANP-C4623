package collectionframework;
import java.util.PriorityQueue;

public class PriorityQueueDemo
{
	 public static void main(String[] args) 
	 {
	  PriorityQueue<Integer> pq=new PriorityQueue<>();
	  //adding elements 
	  pq.add(21);
	  pq.add(20);
	  pq.add(15);
	  pq.add(11);
	  
	  System.out.println("Total Elements are:" + pq);
	  
	  //printing the top element 
	  System.out.println("Top Element is:" + pq.peek());
	  
	  //Removing the top element 
	  System.out.println("Removed Element is:" + pq.poll());

	  System.out.println("Total Elements are:" + pq);
	 }

}


