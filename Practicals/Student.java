package corejava;
//create class student which extends to class person
public class Student extends Person
{
	
	//field
	String studentId;
	String major;
	
	//create constructor
	public Student(String name, int age, String studentId, String major)
	{
		super(name, age);
		this.studentId = studentId;
		this.major = major;
	}
	
	//generate getter and setter methods
	public String getStudentId()
	{
		return studentId;
	}
	public void setStudentId(String studentId)
	{
		this.studentId = studentId;
	}
	public String getMajor()
	{
		return major;
	}
	public void setMajor(String major)
	{
		this.major = major;
	}
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}