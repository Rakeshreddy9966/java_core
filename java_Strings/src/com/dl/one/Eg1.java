package com.dl.one;

public class Eg1 {
public static void main(String[] args) {
	// String is a class 
	// Strings are sequence of characters
	// Strings are immutable,they cannot be changed
	// we can create String inn the two ways 1)Literals 2) using new keyword
	
	String s1 ="Java";
	System.out.println(s1);// 1 object SCP
	
	String s2 = new String ("Java");
	System.out.println(s2);// 2 objects // 1 in heap // scp
	
	String s3 = "Java";
	System.out.println(s3);
	
	String s4 = new String ("Java");
	System.out.println(s4);
	
	// == ref and . equal (content)
	
	System.out.println(s1 == s3);//true
	System.out.println(s1 == s2);//false
	System.out.println(s2 == s4);//false //extra copy
	
	System.out.println(s1.equals(s2));// true
	System.out.println(s1.equals(s3));//true
 }
}
