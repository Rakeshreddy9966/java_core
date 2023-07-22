package com.dl.one;


@FunctionalInterface


interface Varaible {
	public abstract void userdata();
	
}
public  class Eg1 implements Varaible {
     String Username = "Rakesh";
     String Password = "Admin";
     public static void main(String[] args) {
    	 new Eg1().userdata();
	}
      
	@Override
	public void userdata() {
		System.out.println(Username);
		System.out.println(Password);
	}

}
