package com.dl.three;
// default class will be exicuted only in same package will not be called to another package or no public class is present in that package
public class Eg3_Child extends Eg3 {
	
	void m2() {
		System.out.println("m2 method");
		
		
	}
	public static void main(String[] args) {
		new Eg3_Child().m2();
		new Eg3_Child().m1();
	}

}
