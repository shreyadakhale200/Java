package ClassCast_Exceptions;

public class Exception_Childclass extends Throwable_ParentClass {
	public Exception_Childclass() {
		super();
	}

	public Exception_Childclass(int id, String Name) {
		super(id, Name);
	}

	public String toString() {
		return super.toString();
	}
}
