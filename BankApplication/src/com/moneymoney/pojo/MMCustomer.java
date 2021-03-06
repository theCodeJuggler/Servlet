package com.moneymoney.pojo;

import java.time.LocalDate;

import com.abc.bankframe.pojo.Customer;

public class MMCustomer extends Customer {

	//initializing the customer class for the mm bank by calling the constructor of the super class
	public MMCustomer(String customerName, long contactNumber, LocalDate dateOfBirth, String address,
			String nationality, String gender,String email) {
		super(customerName, contactNumber, dateOfBirth, address, nationality, gender,email);
	}

}
