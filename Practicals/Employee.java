package corejava;

public class Employee
{
	private String Name;
	private int Id;
	private double Salary;
	
	
	public Employee(String name, int id, double salary) {
		super();
		Name = name;
		Id = id;
		Salary = salary;
	}


	public void displayDetails(){
		System.out.println("Name:"+Name+"\n "+"Salary:"+Salary+"\n "+"ID:"+Id);
		
	}

}
class Manager extends Employee
{
	int age;
public void displayDetails(){
	System.out.println("age:"+age);
		
	}
}
class Clerk extends Employee
{
	String Work;
public void displayDetails(){
	System.out.println("Work:"+Work);
		
	}
public static void main(String[]args) {

  Employee E=new Employee();
  E.displayDetails();
  Manager M=new Manager();
  M.displayDetails();
  Clerk c=new Clerk();
  c.displayDetails();
}
}