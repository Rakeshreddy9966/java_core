package com.dl.six;

public class Child extends Parent implements GrandParent {

	@Override
	public void m1() {
		System.out.println("m1");
	}

	@Override
	public void m2() {
            System.out.println("m2");
	}

	@Override
	void m4() {
		System.out.println("m4");
		
	}
	public static void main(String[] args) {
//		Child ch1= new Child();
//		ch1.m1();
//		ch1.m2();
//		ch1.m3();
//		ch1.m4();
		
	Parent p1= new Child();
	p1.m3();
	p1.m4();
	}

}
