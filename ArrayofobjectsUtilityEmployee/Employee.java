package ArrayofobjectsUtilityEmployee;

public class Employee {
	private int empid;
	private String name;
	private double Salary;
	
	public Employee(int id, String EmployeeName, double Sal)
	{
		empid = id;
		name = EmployeeName;
		Salary = Sal;
	}
	
	public String toString()
	{
		return "Employee ID = " + empid + ", Employee Name = " + name + ", Employee Salary = " + Salary;
	}

}
