package studentPackage_EnumArrayObjects;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] std1 = new Student[3];
		
		StudentUtilityClass.AcceptStudentDetails(std1);
		StudentUtilityClass.DisplayStudentDetails(std1);
	}

}
