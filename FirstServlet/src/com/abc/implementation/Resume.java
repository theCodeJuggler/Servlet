package com.abc.implementation;

public class Resume {
	
	String fname;
	String lname;
	String gender;
	String qualification;
	String dob;
	String hobbies[];
	String address;
	String skills[];
	String mail;
	String site;
	String contact;
	String summary;
	
	public Resume(String fname, String lname, String gender, String qualification, String dob, String[] hobbies,
			String address, String[] skills, String mail, String site, String contact, String summary) {
		
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.qualification = qualification;
		this.dob = dob;
		this.hobbies = hobbies;
		this.address = address;
		this.skills = skills;
		this.mail = mail;
		this.site = site;
		this.contact = contact;
		this.summary = summary;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getGender() {
		return gender;
	}

	public String getQualification() {
		return qualification;
	}

	public String getDob() {
		return dob;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public String getAddress() {
		return address;
	}

	public String[] getSkills() {
		return skills;
	}

	public String getMail() {
		return mail;
	}

	public String getSite() {
		return site;
	}

	public String getContact() {
		return contact;
	}

	public String getSummary() {
		return summary;
	}
	
}
