package com.dl.one;
//strings has end with ,start with,contains keywords to idenrtif it

public class Eg3 {
public static void main(String [] args) {
	String s1 = new String(" Java");
	System.out.println(s1.endsWith("a"));// true
	System.out.println(s1.endsWith("J"));//false
	String s2 = new String ("Python");
	System.out.println(s2.startsWith("P"));// true
	System.out.println(s2.startsWith("on"));// false
	String s3 = new String("java and python");
	System.out.println(s3.contains("and"));// true
	System.out.println(s3.contains("is"));//false
}
}
