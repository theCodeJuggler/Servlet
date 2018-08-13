//This class maintains the Customer details of a bank.

package com.abc.bankframe.pojo;

import java.time.LocalDate;

public abstract class Customer {
	private final int customerId;
	private String customerName;
	private long contactNumber;
	private String emailId;
	private LocalDate dateOfBirth;
	private String addrs;
	private String nationality;
	private String gender;
	
	private static int custId;
	
	static {
		custId = 200;
	}
	
	{
		this.customerId = ++custId;
	}
	
	public Customer(String customerName, long contactNumber, LocalDate dateOfBirth, String addrs,
			String nationality, String gender) {
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.dateOfBirth = dateOfBirth;
		this.addrs = addrs;
		this.nationality = nationality;
		this.gender = gender;
	}
	
	
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getGender() {
		return gender;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return addrs;
	}
	public void setAddress(String addrs) {
		this.addrs = addrs;
	}
	public int getCustomerId() {
		return customerId;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", contactNumber="
				+ contactNumber + ", emailId=" + emailId + ", dateOfBirth=" + dateOfBirth + ", Address="
				+ addrs + ", nationality=" + nationality
				+ ", gender=" + gender + "]";
	}
}
