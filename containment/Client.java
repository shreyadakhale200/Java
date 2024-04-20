package containment;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Courier c1;
		Address add1 = new Address("Pune","411018");
		c1 = new Courier(1,"King",add1);
		System.out.println(c1);
		
		Courier c2 = new Courier(2,"Max",new Address("Mumbai","411001"));
		System.out.println(c2);
	}

}
