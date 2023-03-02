package corejava;

public class Student {

	public static void main(String[] args) 
	{
		// Creating objects
		StudentData s= new StudentData();
		s.setId(1);
		s.setName("Akshay");
		s.setAge(24);
		System.out.println("Student ID:"+s.getId()+"\nStudent Name:"+s.getName()+"\nStudent Age:"+s.getAge());
	}

}
