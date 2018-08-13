//This class is the abstraction for all the Object creation by any implementing bank. 
//This abstract class has two basic methods that needs to implemented by the inheriting class. 
package com.abc.bankframe.factory;

import java.util.Map;

import com.abc.bankframe.pojo.CurrentAccount;
import com.abc.bankframe.pojo.SavingsAccount;

public abstract class BankFactory {

	public abstract SavingsAccount createNewSavingsAccount(Map<String, Object> account);

	public abstract CurrentAccount createNewCurrentAccount(Map<String, Object> account);

}
