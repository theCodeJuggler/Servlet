package com.bankapp.factory;

import java.time.LocalDate;
import java.util.Map;

import com.abc.bankframe.factory.BankFactory;
import com.abc.bankframe.pojo.CurrentAccount;
import com.abc.bankframe.pojo.SavingsAccount;
import com.bankapp.pojo.MMCurrentAccount;
import com.bankapp.pojo.MMCustomer;
import com.bankapp.pojo.MMSavingsAccount;

//class to initialize the data of customers by calling the constructors
public class MMBankFactory extends BankFactory {

	//instantiating the MMCurrentAccount class for creating Current Account
	@Override
	public CurrentAccount createNewCurrentAccount(Map<String, Object> obj) {
		return new MMCurrentAccount((new MMCustomer((String) obj.get("accountHolderName"), (long) obj.get("contactNo"),
						(LocalDate) obj.get("dateOfBirth"), (String) obj.get("address"), (String) obj.get("nationality"),
						(String) obj.get("gender"))),
				(double) obj.get("accountBalance"), (double) obj.get("overdraft"));
	}

	//instantiating the MMSavingAccount class for creating Saving Account
	@Override
	public SavingsAccount createNewSavingsAccount(Map<String, Object> arg0) {
		return new MMSavingsAccount((new MMCustomer((String) arg0.get("accountHolderName"), (long) arg0.get("contactNo"),
						(LocalDate) arg0.get("dateOfBirth"), (String) arg0.get("address"), (String) arg0.get("nationality"),
						(String) arg0.get("gender"))),
				(double) arg0.get("accountBalance"), (boolean)arg0.get("salary"));
	}

}
