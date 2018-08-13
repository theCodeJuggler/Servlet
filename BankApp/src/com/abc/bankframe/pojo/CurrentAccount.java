//This class extends the BankAccount .
//it has specific instances related to CurrentAccount and their setters and getters.

package com.abc.bankframe.pojo;

public abstract class CurrentAccount extends BankAccount {
	private double odLimit;

	public CurrentAccount(Customer accountHolder, double accountBalance, double odLimit) {
		super(accountHolder, accountBalance);
		this.odLimit = odLimit;
	}

	public double getOdLimit() {
		return odLimit;
	}

	public void setOdLimit(double odLimit) {
		this.odLimit = odLimit;
	}

	public void withdraw(double amount)
	{
		if(amount<=(getAccountBalance()+odLimit))
			setAccountBalance(getAccountBalance()-amount);
		else
			setAccountBalance(getAccountBalance());
	}
	
	@Override
	public String toString() {
		return "CurrentAccount [odLimit=" + odLimit + ", toString()=" + super.toString() + "]";
	}	
}
