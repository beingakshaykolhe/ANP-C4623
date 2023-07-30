package collectionframework;
import java.util.*;
public class HashSetExample
{

	 public static void main(String[] args)
	 {
	 Set<String> s=new HashSet<String>(); 
	 s.add("A");
	 s.add("B");
	 s.add("C");
	 //printing the elements
	 System.out.println("Elements are:" +s);
		
	 String c="D";
		
	 //check whether the string is available or not
	 System.out.println("elements contains:"+c+" " +s.contains(c));
	 }

}
