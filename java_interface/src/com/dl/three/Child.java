package com.dl.three;

public class Child implements GrandParent, Parent {

	@Override
	public void m3() {
		System.out.println("m3 method");

	}

	@Override
	public void m4() {
		System.out.println("m4 method");

	}

	@Override
	public void m1() {
		System.out.println("m1 method");

	}

	@Override
	public void m2() {
		System.out.println("m2 method");
	}
public static void main(String[] args) {
	GrandParent gp=new Child();
	gp.m1();
	gp.m2();
	
	Parent p = new Child();
	p.m3();
	p.m4();
}
}
