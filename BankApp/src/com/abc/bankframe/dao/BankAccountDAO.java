package com.abc.bankframe.dao;

import java.util.Set;

import com.abc.bankframe.pojo.BankAccount;



public interface BankAccountDAO {

	/**
	 * @param bankAccount
	 * 
	 * This method takes account object and adds it in the database
	 */
	void addBankAccount(BankAccount bankAccount);

	/**
	 * @return Set of Accounts
	 * 
	 * This method is responsible for returning all the active accounts
	 */
	Set<BankAccount> viewAll();
	
	void withdrawAction(long accNo, double amt);
	
	void deposit(long accNo, double amt);

}