package com.dl.one;

public class Eg1 {
	//Declare an array and provide elements to it
	public static void main(String[] args) {
		
	
	int a[]= {10,20,30,40};
	System.out.println(a);//[I@27f67
	
	System.out.println(a.length);//4
	
	System.out.println(a[0]);//10
	System.out.println(a[1]);//20
	System.out.println(a[2]);//30
	System.out.println(a[3]);//40
	System.out.println(a[4]);// java.lang.ArrayIndexOutOfBoundsException
	}
}
