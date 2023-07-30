package corejava;

public interface MyInterface //creating interface
{
	public void doSomething(); //method of interface without body

}
class MyClass implements MyInterface //class that implement interface
{
	public void doSomething() //body of interface method
	
	{
		System.out.println("Doing something");
	}
}
class MyMain //main class
{
	public static void main(String[]args)
	{
	MyClass n=new MyClass ();//creating object
	n.doSomething();//calling method
	}
}
