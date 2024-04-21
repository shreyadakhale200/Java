package customer_enumUtilityArrayObjects;

public class Customer {
	private int custid;
	private String name;
	private Account account;
	
	// Parameterized constructor
	public Customer(int id, String CustomerName,Account account)
	{
		custid = id;
		name = CustomerName;
		this.account = account;
	}
	
	public String toString()
	{
		return " Customer id = " + custid + 
			   ", Customer Name = " + name +
			   ", Account Type = " + account;
	}
}
