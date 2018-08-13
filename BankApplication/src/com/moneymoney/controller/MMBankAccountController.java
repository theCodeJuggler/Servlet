package com.moneymoney.controller;

import java.util.Collection;
import java.util.Map;

import com.abc.bankframe.controller.BankController;
import com.abc.bankframe.pojo.BankAccount;
import com.abc.bankframe.pojo.Customer;
import com.abc.bankframe.service.BankAccountService;
import com.moneymoney.service.MMBankAccountService;


public class MMBankAccountController extends BankController {

	BankAccountService service;

	public MMBankAccountController() {
		service=new MMBankAccountService();
	}

	@Override
	public void createNewCurrentAccount(Map<String, Object> arg0) {
		service.createNewSavingsAccount(arg0);
	}

	@Override
	public void createNewSavingsAccount(Map<String, Object> arg0) {
		service.createNewSavingsAccount(arg0);
	}

	@Override
	public Collection<BankAccount> getAllAccounts() {
		
		return service.getAllAccounts();
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		return service.getAllCustomers();
	}

	@Override
	public BankAccount getAccountById(int id) {

		return service.getAccountById(id);

	}

	public void withdraw(int accNo, double amount) {
		BankAccount account = getAccountById(accNo);
		account.setAccountBalance((amount <= (account.getAccountBalance()) ? (account.getAccountBalance() - amount)
				: account.getAccountBalance()));
	}
}