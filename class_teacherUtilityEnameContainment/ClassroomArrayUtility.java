package class_teacherUtilityEnameContainment;

import java.util.Scanner;

public class ClassroomArrayUtility {
	public static void AcceptClassroomDetails(Classroom[] arr)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Room ID = ");
			int rid = sc.nextInt();
			
			System.out.println("Enter Room Name = ");
			String rname =sc.next();
			
			System.out.println("Enter Teacher ID = ");
			int tid = sc.nextInt();
			
			System.out.println("Enter Teacher Name = ");
			String tname = sc.next();
			
			System.out.println("Select Teacher Designation = ");
			int tdes = sc.nextInt();
			
			Designation designation = null;
			switch(tdes)
			{
			case 1:
				designation = Designation.PROFESSOR;
				break;
			case 2:
				designation = Designation.ASSTPROFESSOR;
				break;
			default:
				return;
			}
			arr[i] = new Classroom(rid,rname,new Teacher(tid,tname,designation));
			
		}
	}
	
	public static void DisplayCustomerDetails(Classroom[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
