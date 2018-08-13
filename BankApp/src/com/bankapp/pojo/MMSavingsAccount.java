package com.bankapp.pojo;

import com.abc.bankframe.pojo.Customer;
import com.abc.bankframe.pojo.SavingsAccount;

public class MMSavingsAccount extends SavingsAccount {

	//initializing the savings account class for zero balance account
	public MMSavingsAccount(Customer accountHolder, boolean salary) {
		super(accountHolder, salary);
	}

	//initializing the savings account class for normal account
	public MMSavingsAccount(Customer accountHolder, double accountBalance, boolean salary) {
		super(accountHolder, accountBalance, salary);
	}

	public void withdraw(double amount)
	{
		if(amount<=getAccountBalance())
			setAccountBalance(getAccountBalance()-amount);
		else
			setAccountBalance(getAccountBalance());
	}
	
}
