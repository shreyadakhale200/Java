package EmployeeArrayObjectsUtilityEnum;

public class Employee {
	private int empid;
	private String name;
	private double Salary;
	private EmployeePosition position;
	
	public Employee(int id, String EmployeeName, double Sal, EmployeePosition position)
	{
		empid = id;
		name = EmployeeName;
		Salary = Sal;
		this.position = position;
	}
	
	public String toString()
	{
		return "Employee ID = " + empid + ", Employee Name = " + name + ", Employee Salary = " + Salary 
				+ ", Employee Position = " + position;
	}
}
