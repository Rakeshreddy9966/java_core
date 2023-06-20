package com.dl.one;
// method overloading(one class ,different conditions and different args)
// must contain  one class and method must be same but diff args

public class Eg1 {
	
	public void m1(int a , int b , long c) {
		System.out.println(a + b);
	}
	public void m1(int a , int b , int c ) { 
		System.out.println(a / b / c);
	}
	public void m1 ( long a ,long b ) {
		System.out.println( a  + b);
	}
public static void main(String[] args) {
	Eg1 eg1 = new Eg1();
	eg1.m1(12, 100);
	eg1.m1(10, 12, 30);
	eg1.m1(100000l, 200000000000000l);
}
}

