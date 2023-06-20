package com.dl.one;

public class Child implements Parent {

	@Override
	public void m1() {
		System.out.println("m1 method");

	}

	@Override
	public void m2() {
		System.out.println("m2 method");

	}
public static void main(String[] args) {
	Parent p = new Child();
	p.m1();
	p.m2();
}
}
