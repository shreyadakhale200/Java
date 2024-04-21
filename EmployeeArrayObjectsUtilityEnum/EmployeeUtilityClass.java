package EmployeeArrayObjectsUtilityEnum;

import java.util.Scanner;

public class EmployeeUtilityClass {
	public static void AcceptEmployeeDetails(Employee arr[])
	{
		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		double Salary;
		int position;
		for(int i=0;i<arr.length;i++)
		{			
			System.out.println(" Enter Employee ID = ");
			id = sc.nextInt();
			
			System.out.println("Enter Employee Name = ");
			name = sc.next();
			
			System.out.println("Enter Employee Salary = ");
			Salary = sc.nextDouble();
			
			System.out.println("Enter Employee Position = ");
			position = sc.nextInt();
			EmployeePosition Pos = null;
			switch(position)
			{
			case 1:
				Pos = EmployeePosition.IT;
				break;
			case 2:
				Pos = EmployeePosition.HR;
				break;
			case 3:
				Pos = EmployeePosition.ACCOUNTANT;
				break;
			default:
				return;
			}
			arr[i] = new Employee(id,name,Salary,Pos);
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
