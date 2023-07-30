package corejava;
 //using inheritance concept
public class AbstractionData extends AbstractionExample
{
	 private double salary;
	 
	 public AbstractionData(int id,String name,String address,double salary)
	 {
		 super(id,name,address);
		 this.salary=salary;
		 
	 }
	 public void mailcheck() {
		 System.out.println("Mailing check to" +getName());
	 }
	 
	 

}
}