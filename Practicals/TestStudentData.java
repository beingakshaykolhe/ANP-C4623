package corejava;

public class TestStudentData 
{

	public static void main(String[] args)
	{
		//Creating object of class student
		 Student S=new Student();
		//object is used to access the methods of a class
		 S.setId(123);
		 S.setName("Rutuja");
		 S.setAge(21);
		 System.out.println("Student Data"+"\n"+"Student Id:"+S.getId()+"\n"+"Student Name:"+S.getName()+"\n"+"Student Age:"+S.getAge());

	}

}
