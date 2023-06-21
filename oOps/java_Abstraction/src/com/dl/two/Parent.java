package com.dl.two;
// 2nd method in abstract method we only get static method if we remove the abstract keyword.//
//we have to add 
//obj to main method

// 
public  abstract class Parent {
	static {
		System.out.println("static method");
	}
	{
		System.out.println("instance method");
	}
 public static void main(String[] args) {
	// parent parent = new parent // obj cannot be insiated.
}
}
