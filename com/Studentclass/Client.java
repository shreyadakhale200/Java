package com.Studentclass;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1; // reference of the object stored in stack
		std1 = new Student();	// default constructor
		System.out.println(std1); // toString is implicitly called
		
		Student std2; // reference of the object stored in stack
		std2 = new Student(10,"Shreya",98); // parameterized constructor
		System.out.println(std2);
		
		System.out.println(std1.getSchoolName());
		
		std1.SetSchoolName("Center Point");
		System.out.println(std2.toString());
	}

}
