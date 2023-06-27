package com.dl.one;

public class Eg6 {
	public static void main(String[] args) {
		
		String s1 =  "java python javascript";//                                     
		String[] split = s1.split(" ");
		for (String string : split) {
			System.out.println(string);
		}
		String s2 =  "java: python: javascript";
		String[] split2 = s2.split(" :");
		for (String string : split2) {
			System.out.println(string);
		}
		String s3 =  "java-python-javascript";
		String[] split3 = s3.split(" -");
		for (String string : split3) {
			System.out.println(string);
		}
		String s4 =  "javaandpythonandjavascript";
		String[] split4 = s4.split(" and");
		for (String string : split4) {
			System.out.println(string);
		}
		String s5 =  "java python javascript";
		String[] split5 = s5.split(" ",5);
		for (String string : split5) {
			System.out.println(string);
		}
	}

}
