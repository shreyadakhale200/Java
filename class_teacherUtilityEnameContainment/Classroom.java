package class_teacherUtilityEnameContainment;

public class Classroom {
	private int RoomId;
	private String Name;
	private Teacher teacher;
	
	public Classroom(int RoomId, String Name, Teacher teacher)
	{
		this.RoomId = RoomId;
		this.Name = Name;
		this.teacher = teacher;
	}
	
	public String toString()
	{
		return "Classroom ID = " + RoomId + 
			   ", Classroom Name = " + Name + 
			   ", Teacher = " + teacher;
	}

}
