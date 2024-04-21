package class_teacherUtilityEnameContainment;

public class Teacher {
	private int teacherId;
	private String teacherName;
	private Designation DesName;
	
	public Teacher(int id,String Name, Designation DesName)
	{
		teacherId = id;
		teacherName = Name;
		this.DesName = DesName;
	}
	
	public String toString()
	{
		return " Teacher ID = " + teacherId + 
				", Teacher Name = " + teacherName + 
				", Teacher Designation " + DesName;
	}

}
