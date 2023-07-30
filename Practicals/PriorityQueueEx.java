package collectionframework;
import java.util.Collections;
import java.util.PriorityQueue;
public class PriorityQueueEx {

			 public static void main(String[] args) 
			 {
			  PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
			  //adding elements 
			  
			  pq.add(21);
			  pq.add(20);
			  pq.add(15);
			  pq.add(11);
			  pq.add(46);
			  pq.add(67);
			  pq.add(97);
			  pq.add(23);
			  pq.add(54);
			  pq.add(13);
			 
			 System.out.println(pq);
			 }
}

