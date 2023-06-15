package com.dl.one;

public class Child extends Parent {

	@Override
	public void m1() {
		System.out.println(" m1 method");

	}
	public static void main(String[] args) {
		Child child = new Child();
		child.m1();
		child.m2();
	}

}
