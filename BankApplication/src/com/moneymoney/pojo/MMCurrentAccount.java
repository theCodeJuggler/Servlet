package com.moneymoney.pojo;


import com.abc.bankframe.pojo.CurrentAccount;
import com.abc.bankframe.pojo.Customer;

public class MMCurrentAccount extends CurrentAccount {

	//initializing the current account class by calling super class constructor
	public MMCurrentAccount(Customer accountHolder, double accountBalance, double odLimit) {
		super(accountHolder, accountBalance, odLimit);
	}

	
}
