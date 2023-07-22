package com.dl.one;

import java.util.Scanner;

@FunctionalInterface

interface Login_Anonymus {
	public abstract void Login();
}
public class Eg3 {

	public static void main(String[] args) {
		Login_Anonymus anonymus =  new Login_Anonymus() {

			@Override
			public void Login() {
				Scanner scanner=new Scanner(System.in);
				System.out.println("user name");
				String uName= scanner.nextLine();
				System.out.println(uName);
				System.out .println("User password");
				String UPassword = scanner.nextLine();
				System.out.println(UPassword);
				scanner.close();
				
			}

	};
	anonymus.Login();
	}

}
