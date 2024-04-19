package com.Studentclass;

public class Student {
	//data members
	private int student_rollno;
	private String student_name;
	private int marks;
	
	//static member
	private static String SchoolName = "Modern School";
	
	//default constructor
	public Student()
	{		
		student_rollno = 1;
		student_name = "NA";
		marks = 23;
	}
	
	//parameterized Constructor
	public Student(int student_rollno, String student_name, int marks)
	{
		this.student_rollno = student_rollno;
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
