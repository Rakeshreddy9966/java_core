package com.dl.one;
// method - overiding class must be one or more but conditions and args must be same 
//  more classes same method and same args 
public class Eg2 {

	public void m1(int a ,int b) {
		System.out.println(a + b);
	}
	public void m2 ( int a , int b ) {
		System.out.println(a + b );
	}
	public void m3 ( int a , int b ) {
		System.out.println(a + b );
	}
	public static void main(String[] args) {
		Eg2 eg2 = new Eg2();
		eg2.m1(10, 20);
		eg2.m2(5, 100);
		eg2.m3(10,200);
	}
	
}
