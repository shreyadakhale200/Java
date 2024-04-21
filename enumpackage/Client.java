package enumpackage;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmazonUser au;
		MembershipType type;
		au = new AmazonUser(1,"Shreya",MembershipType.prime);
		System.out.println(au.toString());
		if(au.getType() == MembershipType.prime)
		{
			System.out.println("Discount earned");
		}
	}

}
