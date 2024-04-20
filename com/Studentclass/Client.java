package com.Studentclass;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1; // reference of the object stored in stack
		std1 = new Student();	// default constructor
		System.out.println(std1); // toString is implicitly called
		
		Student std2; // reference of the object stored in stack
		std2 = new Student("Shreya",98); // parameterized constructor and the object created is stored in heap
		System.out.println(std2.toString()); // toString() will override the method in the Object class and we are using toString() according to our convenience that is to print the object
		
		Student std3; // reference of the object stored in stack
		std3 = new Student("Natasha",76); // parameterized constructor and the object created is stored in heap
		System.out.println(std3.toString()); // toString() will override the method in the Object class and we are using toString() according to our convenience that is to print the object
		
		System.out.println(std1.getSchoolName());
		
		std1.SetSchoolName("Center Point");
		System.out.println(std2.toString());
	}

}
