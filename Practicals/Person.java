//multiple inheritance assessment
package corejava;
//create class person
public class Person
{
	//field 
	private String name;
	private int age;
	//create constructor
	public Person(String name, int age) 
	{
		super();
		this.name = name;
		this.age = age;
	}
	//generate getter and setter methods
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	
	

}
