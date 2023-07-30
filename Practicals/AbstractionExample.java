package corejava;

 public abstract class AbstractionExample
  {
   //fields
   private int id;
   private String name;
   private String address;
   
   
    //Creating parameterized constructor
    public AbstractionExample(int id, String name, String address)
    {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
     }
    //creating method
    
    public void mailcheck()
    {
    	
    }
    
    
    @Override
	public String toString() {
		return "AbstractionExample [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

//creating getter and setter methods
   public int getId()
   {
	return id;
    }
   public void setId(int id) 
   {
	this.id = id;
   }
   public String getName()
   {
	return name;
   }
   public void setName(String name)
   {
	this.name = name;
   }
   public String getAddress()
   {
	return address;
   }
   public void setAddress(String address)
   {
	this.address = address;
   }
    
   
  }	
   
	
	


