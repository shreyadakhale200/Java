package containment;

public class Courier {
	
	private int courierid;
	private String Name;
	private Address caddress;
	
	public Courier(int id,String customername,Address caddress)
	{
		courierid = id;
		Name = customername;
		this.caddress = caddress;
	}
	
	public String toString()
	{
		return "Courier id = " + courierid + ", Name - " + Name + ", Address - (" + caddress + ")";
	}

}
