package StudentPackageAbstractClass;

import java.util.Scanner;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s1 = new FirstStandard(12,"srhe",98,76,87);
		Student[] s = new FirstStandard[3];
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("1. Enter Student Details, 2. Display Student Details ");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				StudentUtility.AcceptStudentDetails(s);
				break;
			case 2:
				StudentUtility.DisplayStudentDetails(s);
				break;
			default:
				return;
			}
		}
		}
		
	}

