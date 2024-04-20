package Passbyreference;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1,"King",90000);
		Employee e2 = new Employee(2,"Ernst",65000);
		
		Printtoscreen.PrintDetails(e1);
		Printtoscreen.PrintDetails(e2);
	}

}
