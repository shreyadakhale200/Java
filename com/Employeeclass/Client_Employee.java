package com.Employeeclass;

public class Client_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating the reference of the object in the stack
		Employee e1;
		
		//creating the object in the Heap
		e1 = new Employee();
		
		//calling the method displaydetails
		
		System.out.println("\nBefore changing the values");
//		e1.displayDetails();
		String details = e1.toString();
		System.out.println(details);		
		//the above line will display all the details of the current object like class address
		
		// as a reason we need to override the toString() function with our print function 
		
		
		// In order to access the data members, how will we access it, in order to access the encapsulated data members we will use encapsulated methods
		// But to access only individual data member to get or set we will use getter and setter
		
		//Consider I want to set the object values then I will use getter
		System.out.println("\nAfter changing the values");

		e1.setEmpid(1);
		e1.setEmpname("Shreya");
		e1.setSalary(99000);
		
		System.out.println(e1.getEmpid());
		System.out.println(e1.getEmpname());
		System.out.println(e1.getSalary());
		
		e1.UpdateCompanyName("New IACSD");
		System.out.println("AFter update-------");
		System.out.println(e1.toString());
		System.out.println(e1.toString());
		
	}

}
