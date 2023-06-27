package com.dl.one;

public class Eg9 {
public static void main(String[] args) {
	//immutable
	String s1 = new String("Java");
	String s2 = s1.concat("Python");
	System.out.println(s2);//javapython
	
	String s3 = s1.concat("Javascript");
	System.out.println(s3);//javajavascript
	System.out.println(s1);
	//mutable (sincronized key word will be present so it is thread safety)1.0
	StringBuffer sb1 = new StringBuffer("java");
	sb1.append("python");
	System.out.println(sb1);//javapython
	
	// mutable no thread safety , 1.5
	StringBuilder sb2 = new StringBuilder("java");
	sb2.append("python");
	System.out.println(sb2);//javapython
}
}
