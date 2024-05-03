package com.app.utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import com.app.Customer.Customer;
import com.app.Customer.ServicePlan;
import com.app.Customer_Exceptions.CustomerException;

public class CustomerValidations {
//SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);
	public static ServicePlan validateServicePlan(String plan, double registerAmount) throws CustomerException {
		ServicePlan Plan = parseandValidate(plan);
//		Double RemainingAmount = (Double.parseDouble(plan)-Plan.getPlan());
		if (registerAmount < Plan.getPlan()) {
			throw new CustomerException("Insufficient Amount to Pay !!! Pay " + Plan.getPlan());
		}
		if(registerAmount > Plan.getPlan())
		{
			throw new CustomerException("Pay only specified amount : "+ Plan.getPlan());
		}
		System.out.println("Membership Granted");
		return Plan;
	}

	public static Customer validInputs(String firstName, String lastName, String Email, String Password,
			double RegistrationAmount, String DOB, String plans, List<Customer> cust) throws CustomerException {
		getDupEmail1(Email, cust);
		StrongPassword(Password);
		AgeValidation(DOB);
		EmailValidate(Email, cust);
		ServicePlan plan = parseandValidate(plans);
		LocalDate dob = DateOfBirth(DOB);
		validateServicePlan(plans, RegistrationAmount);
		return new Customer(firstName, lastName, Email, Password, RegistrationAmount, dob, plan);
	}

// ----------------------------------------------------------------
//	public static String CustomerDeleteAccount(String email, List<Customer> customers) throws CustomerException {
////		Iterator<Integer> itr=intList.iterator();
//		int index = customers.indexOf(new Customer(email));
//		if (index == -1) {
//			throw new CustomerException("Cannot delete the details, Invalid Email !!!");
//		}
//		// => valid email
//		return "Removes the details of " + customers.remove(index);
//	}
	public static void CustomerDeleteAccount(String email, List<Customer> customers) throws CustomerException {
//		Iterator<Integer> itr=intList.iterator();
		Customer c = new Customer(email);
		int index = customers.indexOf(c);
		if (index == -1) {
			throw new CustomerException("Cannot delete the details, Invalid Email !!!");
		}
		Customer cust = customers.get(index);
		customers.remove(index);
		System.out.println("Account Deleted!!!");
	}
	// ----------------------------------------------------------------
//	public static void ChangePassword(String email, String password, List<Customer> customers) throws CustomerException 
//	{
//		LoginCustomer(email,customers,password);
//			customers.set
//
//	}

	// ----------------------------------------------------------------
	public static Customer LoginCustomer(String email, List<Customer> customers, String password)
			throws CustomerException {
		Customer cemail = new Customer(email); // Create a Customer object with email and password
		int index = customers.indexOf(cemail);
		if (index == -1) {
			throw new CustomerException("Email not found.");
		} else {
			Customer foundCustomer = customers.get(index);
			if (foundCustomer.getPassword().equals(password)) {
				System.out.println("Successfully Logged in as " + foundCustomer.getEmail());
				return foundCustomer;
			} else {
				throw new CustomerException("Incorrect password.");
			}
		}
	}

	// ----------------------------------------------------------------
	public static void EmailValidate(String Email, List<Customer> cust2) throws CustomerException {
		Customer cust = new Customer(Email);
		boolean flag = true;
		for (char c : Email.toCharArray()) {
			if (c == '@')
				flag = false;
		}
		if (flag) {
			throw new CustomerException("Invalid Email");
		}
		if (Email.contains(".com") || (Email.contains(".org") || (Email.contains(".net")))) {
			System.out.println("valid Email !!");
		} else {
			throw new CustomerException("Enter appropriate email");
		}
	}

	// ----------------------------------------------------------------
	// Password Validation Program
	// ((?=.*\\\\d) (?=.*[a-z]) (?=.*[#@$*]).{5,20})")
//	               ^										^					 ^ 						^
//	one digit occurence		lowercase     uppercase    	numeric
	public static void StrongPassword(String Password) throws CustomerException {
		System.out.println("Password Checking");
		String pattern = ("((?=.*\\d)(?=.*[a-z])(?=.*[#@$*]).{5,20})"); // initialize it in static block
		if (!Password.matches(pattern))
			throw new CustomerException("Weak Password :(");
		else
			System.out.println("Strong Password :)");
	}

	// ----------------------------------------------------------------
	public static LocalDate AgeValidation(String dob) throws CustomerException {
		LocalDate BirthDate = LocalDate.parse(dob);
		System.out.println("Age Validation !!");
		int Age = Period.between(BirthDate, LocalDate.now()).getYears();
		if (Age > 18) {
			System.out.println("Valid Age !!");
		} else
			throw new CustomerException("Invalid Age, Not Eligible to create an account !!!");
		return BirthDate;
	}

	// ----------------------------------------------------------------

	public static void getDupEmail1(String email, List<Customer> customer) throws CustomerException {
		Customer cust = new Customer(email);
		for (Customer c : customer) {
			if (c.getEmail().equals(email)) {
				throw new CustomerException("Duplicate Account");
			}
		}
	}

//	public static void getDupEmail(String email, List<Customer> customers) throws CustomerException {
//		for (Customer customer : customers) {
//			if (customer.getEmail().equals(email)) {
//				System.out.println("Duplicate Account");
//				return; // Exit the method if a duplicate email is found
//			}
//		}
//		System.out.println("No Duplicate Account"); // Print if no duplicate email is found
//	}

	// ----------------------------------------------------------------
	public static LocalDate DateOfBirth(String DOB) {
		return LocalDate.parse(DOB);
	}

	public static ServicePlan parseandValidate(String plans) {
		return ServicePlan.valueOf(plans.toUpperCase());
	}

//	public static double 
}
