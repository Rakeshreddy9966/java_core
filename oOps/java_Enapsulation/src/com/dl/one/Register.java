package com.dl.one;
//Encapsulation
//wrapping the data and their methods into a single unit
public class Register {
//data
	private String userName;
	private String Email;
	private Long Contact;
	private double userSalary;
	
	//methods
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Long getContact() {
		return Contact;
	}
	public void setContact(Long contact) {
		Contact = contact;
	}
	public double getUserSalary() {
		return userSalary;
	}
	public void setUserSalary(double userSalary) {
		this.userSalary = userSalary;
	}
	
	
}
