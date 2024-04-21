package Studentpackage_enum;

public class Student {
	private int Studentrollno;
	private String Name;
	private course coursesName;
	
	public Student(int rollno, String StudentName, course coursesName)
	{
		Studentrollno = rollno;
		Name = StudentName;
		this.coursesName = coursesName;
	}
	
	
	
	public String toString()
	{
		return "Student Roll No = " + Studentrollno + ", Student Name = " + Name + ", Student Course Name = " + coursesName;
	}



	public course getCoursesName() {
		return coursesName;
	}



	public void setCoursesName(course coursesName) {
		this.coursesName = coursesName;
	}
}
