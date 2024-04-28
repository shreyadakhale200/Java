package ClassCast_Exceptions;

public class Throwable_ParentClass {
	private int id;
	private String Name;

	public Throwable_ParentClass() {
		id = 0;
		Name = "Exception";
	}

	public Throwable_ParentClass(int id, String Name) {
		this.id = id;
		this.Name = Name;
	}

	public String toString() {
		return "id : " + id + ", Name: " + Name;
	}
}

