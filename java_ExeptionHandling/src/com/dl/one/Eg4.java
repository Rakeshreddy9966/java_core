package com.dl.one;

public class Eg4 {
public static void main(String[] args) {
	
	
	try {
		System.out.println("Before");
		String s1 = "Ten";
		int parseInt = Integer.parseInt(s1);
		System.out.println(parseInt);
	} catch (NumberFormatException e) {
		System.out.println(e);
	}
	System.out.println("After"); 
}
}
