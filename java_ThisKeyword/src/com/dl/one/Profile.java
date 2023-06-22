package com.dl.one;

public class Profile {
	// instance varaible
	public String userName;
	public String userEmail;
	public long userContact;
	public double userSalary;
	public String userAddress;

	

	public Profile(String userName, String userEmail, long userContact, double userSalary, String userAddress) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userContact = userContact;
		this.userSalary = userSalary;
		this.userAddress = userAddress;
		
//		public Profile(String userName, String userEmail, long userContact, double userSalary, String userAddress) {
//			super();
//			UserName = userName;
//			UserEmail = userEmail;
//			UserContact = userContact;
//			UserSalary = userSalary;
//			UserAddress = userAddress;
	}
	public void display() {
		System.out.println(userName);
		System.out.println(userEmail);
		System.out.println(userContact);
		System.out.println(userSalary);
		System.out.println(userAddress);
		
	}
	public static void main(String[] args) {
		Profile profile = new Profile("Rakesh", "rakesh@gmail.com", 9966473596L, 1000000.0, "hyd");
		profile.display();
		
	}

}
