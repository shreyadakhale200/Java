package deviceFeaturesInterface;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m = new Mobile("9954778970","Samsung",99008);
		Car c = new Car(90432,"TATA",400000);
		
		System.out.println(m.toString());
		System.out.println(c.toString());

	}

}
