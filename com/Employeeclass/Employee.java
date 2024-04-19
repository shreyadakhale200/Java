package com.Employeeclass;

public class Employee {
	// data members
	//Encapsulated data
	private int empid;
	private String empname;
	private double salary;
	private static String CompanyName = "IACSD";
    //static member belongs to the class rather than to instance(object) of the class
	
	//Default Constructor
	// Constructor is a special method which is implicitly called whenever an object is created
	// Constructor should be same as that of the class name because it will help the compiler to identify the constructor of the particular class
	// Any task which is related to initialization of an object or any task when the student will click the submit the button after registration the object will be created which is called a startup
	
	public Employee()
	{
		empid = 0;
		empname = "Shreya";
		salary = 0;
	}
	
	// Parameterized Constructor
	//this keyword is used when the name of the parameters and the variable name is same 
	// JVM will prioritize the parameters first so if anywhere JVM detects the parameter name it will assign it to the left side
	// which will mean that the parameter is being saved in the parameter here where this keyword is used e.g.,
	public Employee(int empid, String empname,double salary)
	{
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	
//  public Employee(int eid, String ename,double sal)
//	{
//		empid = eid;
//		ename = empname;
//		salary = sal;
//	}
	
	//Creating the method display details to display all the parameters of the user
	// As it is not the ideal requirement to use input or output operations in the entity class we will use 
	// toString() method which is the method of the root class "Object" in JAVA
	//	public void displayDetails()
	//	{
	//		System.out.println("Employee ID = " + empid +" Employee name - " + empname + " Employee Salary = " + salary);
	//	}
	
	//Getters and Setters
	// get value of salary, empid, empname of the current object from the memory and return it to the client code
	// Getter

	//getter for empid- gets the value of empid of current object
	//from memory and return to the client code
	public int getEmpid()
	{
		return empid;
	}
	
	//getter for empname - gets the value of empname of current object
	//from memory and return to the client code
	public String getEmpname()
	{
		return empname;
	}
	
	//getter for salary- gets the value of salary of current object
	//from memory and return to the client code
	public double getSalary()
	{
		return salary;
	}
	
	//Setter
	
	//setter for empid- it receives the empid value from client code and 
	//assign to current object
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	//setter for empname- it receives the empname value from client code and 
	//assign to current object
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	//setter for salary- it receives the salary value from client code and 
	//assign to current object
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
//	public static String UpdateCompanyName(String newCompanyName)
//	{
//		CompanyName = newCompanyName;
//		return CompanyName;
//	}
//	
	public static void UpdateCompanyName(String newCompanyName)
	{
		CompanyName = newCompanyName;
	}
	
	@Override // writing override is not compulsory but it will be the easier for the developer to analyze the code
	public String toString()
	{
		return "Employee ID = " + empid + " Employee Name - " + empname + " Employee Salary = " + salary + " Company Name - " + CompanyName;
	}
	
	
}
