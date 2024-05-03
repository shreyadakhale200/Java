package com.app.tester;

import static com.app.utils.CustomerValidations.CustomerDeleteAccount;
import static com.app.utils.CustomerValidations.LoginCustomer;
import static com.app.utils.CustomerValidations.validInputs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.app.Customer.Customer;
import com.app.custom_ordering.CustomerCustomerId_Comparator;
import com.app.custom_ordering.CustomerCustomerid_Comparator_ASC;
import com.app.utils.CustomerValidations;

public class CustomerApp {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// System.out.println("Enter No of Customers : ");
			List<Customer> cust = new ArrayList<>();
			boolean exit = false;
			System.out.println("---------------------------Welcome---------------------------");
			while (!exit) {
				System.out.println(
						"1. Sign Up \n" + "2. Sign In \n" + "3. Display Customer Details \n" + "4. Delete Account \n"
								+ "5. Sort Customers in Descending Order\n" + "6. Sort Customers in Ascending Order\n"
								+ "7. Change password\n" + "8. Email Ascending Sorting\n" + "0. Exit");
				System.out.println("Choose an option : ");
				try {
					switch (sc.nextInt()) {
					case 1:
						// Input Customer Details
						System.out.println(
								"First Name, Last Name, Email, Password, Registration Amount,  Enter Date of Birth, Enter Service Plan");
//						Customer cust1 = validInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),
//								sc.next(), sc.next(), cust);
						
						Customer cust1 = validInputs("Shreya", " Dakhale", "shreyadakhale@gmail.com", "Shr@ram1", 2000,
								"2000-11-17", "gold", cust);
						cust.add(cust1);
						Customer cust2 = validInputs("Pragati", "Kumrawat", "pragati@gmail.com", "PanParag@ram18", 1000,
								"2000-11-17", "silver", cust);
						cust.add(cust2);
						Customer cust3 = validInputs("Lata", "Mangeshkar", "lata@gmail.com", "Legend@top23", 5000,
								"1927-02-21", "diamond", cust);
						cust.add(cust3);
						Customer cust4 = validInputs("Sarah", "Basu", "sarah34@gmail.com", "Sara@top23", 10000,
								"1997-12-15", "platinum", cust);
						cust.add(cust4);
						Customer cust5 = validInputs("Rishabh", " Barai", "rb@gmail.com", "Rish@13", 2000,
								"2000-11-17", "gold", cust);
						cust.add(cust5);
//						Customer cust2 
						System.out.println("Signed up !");
						break;

					case 2:
//						Customer Login using Email and Password
						System.out.println("Display Account Summary - ");
						System.out.println("Enter Email and Password to validate : ");
						LoginCustomer(sc.next(), cust, sc.next());
//						System.out.println(customer);
						break;

					case 3:
//						Display all Customers
						System.out.println(
								"---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
						System.out.println("All account Details - ");
						if (cust.isEmpty()) {
							System.out.println("No customers found.");
						} else {
							for (Customer c : cust) {
								System.out.println(c);
							}
							System.out.println(
									"---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
						}
						break;

					case 4:
						System.out.println("Enter email to delete account ");
						CustomerDeleteAccount(sc.next(), cust);
						break;

					case 5:
						System.out.println("ID Sorting DESCENDING");
						Collections.sort(cust, new CustomerCustomerId_Comparator());
						break;

					case 6:
						System.out.println("ID Sorting ASCENDING");
						Collections.sort(cust, new CustomerCustomerid_Comparator_ASC());
						break;

					case 7:
//						Change Password
						System.out.println("Enter Email and Password to Change PASSWORD !!!!");
						cust1 = CustomerValidations.LoginCustomer(sc.next(), cust, sc.next());
						System.out.println("Enter New Password : ");
						cust1.setPassword(sc.next());
						System.out.println("Password Changed Successfully ");
						System.out.println("Your Password is : " + cust1.getPassword());
						break;

					case 8:
//						Sort According to email
						System.out.println("Sorting Email");
						Collections.sort(cust, new Comparator<Customer>() {
							@Override
							public int compare(Customer o1, Customer o2) {
								// TODO Auto-generated method stub
								return o1.getEmail().compareTo(o2.getEmail());
							}
						});
						System.out.println("Email Sorting");
						break;

					case 9:
//						2.2 Display customer details sorted as per the dob n last name  : using custom ordering , 
//						using anonymous inner class.
						class CustomerComparator implements Comparator<Customer> {
							public int compare(Customer c1, Customer c2) {
								if (c1.getDob().equals(c2.getDob())) {
									c1.getLastName().compareTo(c2.getLastName());
								}
								return c1.getLastName().compareTo(c2.getLastName());
							}
						}
						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
					sc.next();
				}
			}
		}
	}
}

//   Shreya Dakhale shreyadakhale@gmail.com shrey@ram18 2300 2000-11-17 silver
//   Pragati Kumrawat pragati@gmail.com PanParag@ram18 2300 1000-11-17 diamond