package corejava;
//creating class BankAccount
public class BankAccount
{   
	//fields
	private double balance;
	private String accountNumber;
	private String deposit;
	private String withdraw;
	//constructor
	public BankAccount(double balance, String accountNumber)
	{
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	
	//getter method
	public double getBalance() 
	{
		return balance;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	//method
	public void deposit(double amount)
	{
		System.out.println("deposit:"+deposit);
		
	}
	//method
	public void withdraw(double anount)
	{
		System.out.println("withdraw:"+withdraw);
	}
	
	
	
	
	

}

