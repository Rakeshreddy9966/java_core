package com.dl.one;

public class Eg3 {
public static void main(String[] args) {
	
	try {
		System.out.println("before");
		String s1 = null;
		System.out.println(s1);
		System.out.println(s1.length());//  null pointer exceeption
		

	} catch (NullPointerException e) {
		System.out.println(e);
	}
	System.out.println("after");
}
}