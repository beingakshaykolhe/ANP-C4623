package corejava;
//create class Graduate Student
public class GraduateStudent extends Student
{
	String advisor;
	String thesisTopic;
	
	//create constructor
	public GraduateStudent(String name, int age, String studentId, String major, String advisor, String thesisTopic)
	{
		super(name, age, studentId, major);
		this.advisor = advisor;
		this.thesisTopic = thesisTopic;
	}
	
	
   //generate getter and setter methods
	public String getAdvisor() 
	{
		return advisor;
	}
	public void setAdvisor(String advisor)
	{
		this.advisor = advisor;
	}
	public String getThesisTopic()
	{
		return thesisTopic;
	}
	public void setThesisTopic(String thesisTopic)
	{
		this.thesisTopic = thesisTopic;
		
	}
	//main method
	public static void main(String[]args) 
	{
		//instance creation
		GraduateStudent g=new GraduateStudent("rutuja",21,"123","xyz","lmn","asd");
		System.out.println("Name:"+g.getName()+"\n"+"Age:"+g.getAge()+"\n"+"Student Id:"+g.getStudentId()+"\n"+"Major:"+g.getMajor()+"\n"+"Advisor:"+g.getAdvisor()+"\n"+"thesisTopic:"+g.getThesisTopic());
	 
	}
	
	

}
