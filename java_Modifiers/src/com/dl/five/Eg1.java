package com.dl.five;
//private class we need to call in only same class
public class Eg1 {
	private int id = 101;
	private String username = "Rakesh";
	public static void main(String[] args) {
		System.out.println(new Eg1().id);
		System.out.println(new Eg1().username);
	}

}
