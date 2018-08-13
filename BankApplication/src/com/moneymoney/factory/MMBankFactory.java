package com.moneymoney.factory;

import java.time.LocalDate;
import java.util.Map;

import com.abc.bankframe.factory.BankFactory;
import com.abc.bankframe.pojo.CurrentAccount;
import com.abc.bankframe.pojo.SavingsAccount;
import com.moneymoney.pojo.*;

//class to initialize the data of customers by calling the constructors
public class MMBankFactory extends BankFactory {

	//instantiating the MMCurrentAccount class for creating Current Account
	@Override
	public CurrentAccount createNewCurrentAccount(Map<String, Object> obj) {
		return new MMCurrentAccount((new MMCustomer((String) obj.get("accountHolderName"), (long) obj.get("contactNo"),
				(LocalDate) obj.get("dateOfBirth"), (String) obj.get("address"), (String) obj.get("nationality"),
				(String) obj.get("gender"),(String)obj.get("email"))),
		(double) obj.get("accountBalance"), (double) obj.get("overdraft"));
	}

	//instantiating the MMSavingAccount class for creating Saving Account
	@Override
	public SavingsAccount createNewSavingsAccount(Map<String, Object> obj) {
		return new MMSavingsAccount((new MMCustomer((String) obj.get("accountHolderName"), (long) obj.get("contactNo"),
						(LocalDate) obj.get("dateOfBirth"), (String) obj.get("address"), (String) obj.get("nationality"),
						(String) obj.get("gender"),(String)obj.get("email"))),
				(double) obj.get("accountBalance"), (boolean)obj.get("salary"));
	}

}
