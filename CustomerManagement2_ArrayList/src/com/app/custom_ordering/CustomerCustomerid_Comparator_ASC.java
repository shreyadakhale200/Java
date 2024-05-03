package com.app.custom_ordering;

import java.util.Comparator;

import com.app.Customer.Customer;

public class CustomerCustomerid_Comparator_ASC implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		if (c1.getCustomerid() < c2.getCustomerid())
			return -1;
		if (c1.getCustomerid() == c2.getCustomerid())
			return 0;
		return 1;
	}

}
