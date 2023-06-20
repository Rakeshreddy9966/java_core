package com.dl.four;

public class Client {

	public static void main(String[] args) {
		Child child = new Child();
		child.m1();
		child.m2();
		child.m3();
		child.m4();
		
	
	// polymorphism // interface(by using this we hide information)
	Grandparent child1=new Child();
	child1.m1();
	child1.m2();
	child1.m3();
	child1.m4();
	
	}
}
