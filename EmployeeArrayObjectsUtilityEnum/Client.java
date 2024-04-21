package EmployeeArrayObjectsUtilityEnum;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emp = new Employee[3];
		
		EmployeeUtilityClass.AcceptEmployeeDetails(emp);
		EmployeeUtilityClass.DisplayEmployeeDetails(emp);

	}

}
