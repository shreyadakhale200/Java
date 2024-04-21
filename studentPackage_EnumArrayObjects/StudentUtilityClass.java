package studentPackage_EnumArrayObjects;

import java.util.Scanner;

public class StudentUtilityClass {
	
	public static void AcceptStudentDetails(Student[] arr)
	{
		// to accept user input
		Scanner sc = new Scanner(System.in);
		
		// to accept no of user input in the array of reference
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the Roll no = ");
			int rollNo = sc.nextInt();
			
			System.out.println("Enter the Name = ");
			String Name = sc.next();
			
			System.out.println("Enter the Course you want to apply for = ");
			int course = sc.nextInt();
			
			Courses courseName = null;
			
			switch(course)
			{
			case 1:
				courseName = Courses.DAC;
				break;
			case 2:
				courseName = Courses.DBDA;
				break;
			case 3:
				courseName = Courses.DITTIS;
				break;
			default:
				return;
			}
			arr[i] = new Student(rollNo,Name,courseName);
		}
	}
	
	public static void DisplayStudentDetails(Student[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
