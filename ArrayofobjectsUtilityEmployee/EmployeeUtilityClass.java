package ArrayofobjectsUtilityEmployee;

import java.util.Scanner;

public class EmployeeUtilityClass {
	public static void AcceptEmployeeDetails(Employee[] arr)
	{
		Scanner sc = new Scanner(System.in);
		int id;
		String Name;
		double salary;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Employee ID = ");
			id = sc.nextInt();
			
			System.out.println("Enter Employee Name = ");
			Name = sc.next();
			
			System.out.println("Enter Employee Salary = ");
			salary = sc.nextDouble();
			
			arr[i] = new Employee(id, Name, salary);
		}
	}
	
	public static void DisplayEmployeeDetails(Employee[] arr) 
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
