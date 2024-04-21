package customer_enumUtilityArrayObjects;

public class Account {
	private String acctid;
	private double balance;
	private AccountType type;
	
	public Account(String id,double bal,AccountType type) 
	{
		acctid = id;
		balance = bal;
		this.type = type;
	}
	
	public String toString()
	{
		return "Customer account ID = " + acctid +
			   ", Account Balance = " + balance + 
			   ", Customer Account type = " + type;
	}

}

