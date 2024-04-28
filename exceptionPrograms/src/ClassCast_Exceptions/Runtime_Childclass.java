package ClassCast_Exceptions;
public class Runtime_Childclass extends Exception_Childclass {
	public Runtime_Childclass() {
		super();
	}

	public Runtime_Childclass(int id, String Name) {
		super(id, Name);
	}

	public String toString() {
		return super.toString();
	}
}