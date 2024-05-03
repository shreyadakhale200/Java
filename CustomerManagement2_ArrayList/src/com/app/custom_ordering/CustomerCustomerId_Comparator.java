package com.app.custom_ordering;

import java.util.Comparator;

import com.app.Customer.Customer;

public class CustomerCustomerId_Comparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		System.out.println("in Comparator");
		if (o1.getCustomerid() > o2.getCustomerid())
			return -1;
		if (o1.getCustomerid() == o2.getCustomerid())
			return 0;
		return 1;
	}

}
