package com.dl.one;

public class Eg7 {
public static void main(String[] args) {
	try{int a = 10;
	int b = 20;
	int c = 0;

	System.out.println(a/b);
	System.out.println(a/c);
	
	int aa []= {10,20,30,40,50};
	
	System.out.println(aa[0]);
	System.out.println(aa[4]);
	System.out.println(aa[5]);
	
	String s1 = null;
	System.out.println(s1);
	System.out.println(s1.length());
	
	String s11 = " hello java and python";
	System.out.println(s11.charAt(10));
	System.out.println(s11.charAt(30));// java.lang.StringIndexOutOfBoundsException
	
	}catch(Exception e) {
			System.out.println(e);
}
}
}