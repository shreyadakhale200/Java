package com.app.utils;

import static com.app.utils.CustomerValidations.validInputs;

import java.util.List;

import com.app.Customer.Customer;
import com.app.Customer_Exceptions.CustomerException;

public class PopulateFields {
	public static List<Customer> PopulateFields(List<Customer> cust) throws CustomerException {
		Customer cust1 = validInputs("Shreya", " Dakhale", "shreyadakhale@gmail.com", "Shr@ram1", 2000, "2000-11-17",
				"gold", cust);
		Customer cust2 = validInputs("Pragati", "Kumrawat", "pragati@gmail.com", "PanParag@ram18", 1000, "2000-11-17",
				"silver", cust);
		Customer cust3 = validInputs("Lata", "Mangeshkar", "lata@gmail.com", "Legend@top23", 5000, "1927-02-21",
				"diamond", cust);
		Customer cust4 = validInputs("Sarah", "Basu", "sarah34@gmail.com", "Sara@top23", 10000, "1997-12-15",
				"platinum", cust);
		Customer cust5 = validInputs("Rishabh", " Barai", "rb@gmail.com", "Rish@13", 2000, "2000-11-17", "gold", cust);
		Customer[] data = { cust1, cust2, cust3, cust4, cust5 };
		for (Customer c : data) {
			cust.add(c);
		}
		return cust;
	}
}
