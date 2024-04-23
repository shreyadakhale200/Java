package StudentPackageAbstractClass;

import java.util.Scanner;

public class StudentUtility {
	
	public static void AcceptStudentDetails(Student[] s)
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter Student Roll no ");
			int id = sc.nextInt();
			
			System.out.println("Enter Student Name ");
			String name = sc.next();
			
			System.out.println("Enter Phone Number ");
			String phoneno = sc.next();
			
			System.out.println("Enter Address ");
			String address = sc.next();
			
			System.out.println("Enter Father's Name ");
			String father = sc.next();
			
			System.out.println("Enter Mother's Name ");
			String mother = sc.next();
			
			System.out.println(" Enter Student Marks 1 ");
			float Marks1 = sc.nextFloat();
			
			System.out.println(" Enter Student Marks 2 ");
			float Marks2 = sc.nextFloat();

			System.out.println(" Enter Student Marks 3 ");
			float Marks3 = sc.nextFloat();			
//			System.out.println(s[i]);
			s[i] = new FirstStandard(id,name,Marks1,Marks2,Marks3,phoneno,address,father,mother);
		}
	}
		public static void DisplayStudentDetails(Student[] s)
		{
			for(int i=0;i<s.length;i++)
			{
				System.out.println(s[i]);
			}
		}

}
