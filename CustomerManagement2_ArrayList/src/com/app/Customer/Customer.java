package com.app.Customer;

import java.time.LocalDate;

public class Customer {

	private int customerid;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;
	private double registrationAmount;
	private LocalDate DateOfBirth;
	private ServicePlan plans;

	private static int counter = 1;

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public Customer(String FirstName, String LastName, String Email, String Password, Double RegistrationAmount,
			LocalDate dob, ServicePlan plans) {
//		super();
		this.customerid = counter++;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Email = Email;
		this.Password = Password;
		this.registrationAmount = RegistrationAmount;
		this.DateOfBirth = dob;
		this.plans = plans;
	}

//	@Override
//	public String toString() {
//		return "Customer ID : " + customerid + ", Customer First Name : " + FirstName + ", Customer Last Name : "
//				+ LastName + ", Customer Email : " + Email + ", Customer Password : " + Password
//				+ ", Customer Registration Amount : " + registrationAmount + ", Customer Date of Birth : " + DateOfBirth
//				+ ", Customer Service Plan : " + plans;
//	}
	@Override
	public String toString() {
		return "ID : " + customerid + ", First Name : " + FirstName + ", Last Name : "
				+ LastName + ", Email : " + Email + ", Password : " + Password
				+ ", Registration Amount : " + registrationAmount + ", Date of Birth : " + DateOfBirth
				+ ", Service Plan : " + plans;
	}

	public Customer(String Email) {
		this.Email = Email;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("In main equals");
		if (o instanceof Customer) {
			Customer cus = (Customer) o;
			return (this.Email).equals(cus.Email);
		}
		return false;
	}

// shreyadakhale@gmail.com shrey@ram18
//
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public LocalDate getDob() {
		return DateOfBirth;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public void setPlans(ServicePlan plans) {
		this.plans = plans;
	}

	public ServicePlan getPlans() {
		return plans;
	}

	public static void setCounter(int counter) {
		Customer.counter = counter;
	}

}
