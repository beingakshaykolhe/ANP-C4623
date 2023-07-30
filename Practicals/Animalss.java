package corejava; 
interface Animalss 
{
  public void sound();//interface method()without body
}
class Monkey implements Animalss //class that implement interface
{
	public void sound()//body of interface method sound
	{
		System.out.println("Monkey......");
	}
}
class Mains
{
	public static void main(String []args)
	{
		 Monkey m=new Monkey();//creating object
		 m.sound();//calling method
	}
}

