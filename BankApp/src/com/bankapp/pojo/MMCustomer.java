package com.bankapp.pojo;

import java.time.LocalDate;

import com.abc.bankframe.pojo.Customer;

public class MMCustomer extends Customer{
	
	public MMCustomer(String customerName, long contactNumber, LocalDate dateOfBirth, String addrs,
			String nationality, String gender) {
		super(customerName, contactNumber, dateOfBirth, addrs, nationality, gender);
	}

}
