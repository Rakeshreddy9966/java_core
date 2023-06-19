package com.dl.one;

public class RegisterImpl extends Register {
 
	
	 public static void main(String[] args) {
		RegisterImpl impl = new RegisterImpl();
		impl.setUserName("Rakesh");
		impl.setEmail("rakesh@gmail.com");
		impl.setContact(99887678L);
		impl.setUserSalary(10000.0);
		
		System.out.println(impl.getUserName());
		System.out.println(impl.getEmail());
		System.out.println(impl.getContact());
		System.out.println(impl.getUserSalary());
	}
}
