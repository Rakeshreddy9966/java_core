package com.dl.one;

import java.util.Scanner;

@FunctionalInterface

interface Login{
	public abstract void login();
}

class user implements Login{

	@Override
	public void login() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("user name");
		String uName= scanner.nextLine();
		System.out.println(uName);
		System.out .println("User password");
		String UPassword = scanner.nextLine();
		System.out.println(UPassword);
		scanner.close();
	}
	
}
public class Eg2 {

	public static void main(String[] args) {
		Login login = new user();
		login.login();

	}

}
