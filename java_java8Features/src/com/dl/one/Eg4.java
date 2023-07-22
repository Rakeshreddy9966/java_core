package com.dl.one;
@FunctionalInterface
interface Login_Lambda{
	public abstract void login(String Uname,String Upass);
}

public class Eg4 implements Login_Lambda {
	
	@Override
	public void login(String Uname, String Upass) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Login_Lambda login_Lambda = (Uname , Upass)->System.out.println("Username is" + Uname + "UserPassword is "+ Upass);
		login_Lambda.login("Rakesh","Admin");
		

	}

	

}
