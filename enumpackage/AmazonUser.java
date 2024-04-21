package enumpackage;

public class AmazonUser {
	private int userid;
	private String username;
	private MembershipType type;
	
	// Parameterized constructor
	public AmazonUser(int id, String name, MembershipType type)
	{
		userid = id;
		username = name;
		this.type = type;
	}
	
	
	
	public String toString()
	{
		return "User id = " + userid + ", User Name = " + username + ", Membership Type = " + type;
	}



	public MembershipType getType() {
		return type;
	}



	public void setType(MembershipType type) {
		this.type = type;
	}

}
