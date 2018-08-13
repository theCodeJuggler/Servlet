package com.abc.bankframe.controller;

import java.util.Collection;
import java.util.Map;

import com.abc.bankframe.pojo.BankAccount;
import com.abc.bankframe.pojo.Customer;
import com.abc.bankframe.service.BankAccountService;


/**
 * 
 * 
 * This is a controller which has all abstraction of bank services
 */
public abstract class BankController {
	
	BankAccountService service;

	public abstract void createNewSavingsAccount(Map<String, Object> account);

	public abstract void createNewCurrentAccount(Map<String, Object> account);
	
	public double getCurrrentBalance(BankAccount bankAccount) {
		return bankAccount.getAccountBalance();
	}
	
	public int getNextAccountNumber() {
		return BankAccount.getNextAccountNumber();
	}
	
	public abstract Collection<BankAccount> getAllAccounts();
	
	public abstract Collection<Customer> getAllCustomers();
	
	public abstract BankAccount getAccountById(int id);
	
}
