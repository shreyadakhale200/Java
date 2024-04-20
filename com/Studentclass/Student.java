package com.Studentclass;

public class Student {
	//data members
	private int student_rollno;
	private String student_name;
	private int marks;
	
	//static member
	private static String SchoolName = "Modern School";
	
	//Now we will auto increment the Roll no of the Student object by incrementing counter whenever the object will be created
	//we will do it in parameterized constructor because of the above reasons
	private static int count = 0;
	
	//default constructor
	public Student()
	{		
		student_rollno = 1;
		student_name = "NA";
		marks = 23;
	}
	
	//parameterized Constructor
	public Student(String student_name, int marks)
	{
		count++;
		student_rollno = count;
		this.student_name = student_name;
		this.marks = marks;
	}
	
	public static String getSchoolName()
	{
		return SchoolName;
	}
	
	public static void SetSchoolName(String newSchoolName)
	{
		SchoolName = newSchoolName;
	}
	
	public String toString()
	{
		return "Student Roll No = " + student_rollno + " Student Name - " + student_name + " Student Marks = " + marks + " School Name - " + SchoolName;
	}

}
