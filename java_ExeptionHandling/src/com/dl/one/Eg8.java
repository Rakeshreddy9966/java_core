package com.dl.one;

public class Eg8 {
public void getName(String name) throws Exception {
	if(name == "Admin") {
		System.out.println("user name is   " + name);
		
	}else {
		throw new Exception("User name is  ");
	}
}

public static void main(String[] args) throws Exception {
	Eg8 eg8 = new Eg8();
	eg8.getName("Admin");
}
}
