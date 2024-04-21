package studentPackage_EnumArrayObjects;

public class Student {
	private int rollNo;
	private String name;
	private Courses CourseName;
	
	// static member
	private static String College = "IACSD";
	
	//Parameterized Constructor
	public Student(int rollno,String StudentName, Courses CourseName)
	{
		rollNo = rollno;
		name = StudentName;
		this.CourseName = CourseName;
		College = "IACSD";
	}
	
	//ToString() function
	public String toString()
	{
		return "Student Roll No = " + rollNo +
			   ", Student Name = " + name + 
			   ", Student Course = " + CourseName + 
			   ", Student College = " + College;
	}
}
