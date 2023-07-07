package com.dl.one;

public class Eg5 {
public static void main(String[] args) {
	try {
	System.out.println("before");
	String s1 = " hello java and python";
	System.out.println(s1.charAt(10));
	System.out.println(s1.charAt(30));// java.lang.StringIndexOutOfBoundsException
	}catch(StringIndexOutOfBoundsException e) {
	System.out.println(e);
	}
	System.out.println("after");
}
}
