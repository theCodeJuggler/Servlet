package com.abc.bankframe.factory;

import java.util.Map;

import com.abc.bankframe.pojo.CurrentAccount;
import com.abc.bankframe.pojo.SavingsAccount;


/**
 * 
 * 
 * 
 * For creating the account objects
 *
 */
public abstract class BankFactory {
	
	public abstract SavingsAccount createNewSavingsAccount(Map<String, Object> account);
	
	public abstract CurrentAccount createNewCurrentAccount(Map<String, Object> account);
	
	
}
