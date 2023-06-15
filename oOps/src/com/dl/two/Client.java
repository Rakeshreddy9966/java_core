package com.dl.two;
// multi -level inheritance
class Grandparent{
	public void m1() {
		System.out.println("m1 is a grandparent" );
	}
	}
class Parent extends Grandparent{
	public void m2() {
		System.out.println("m2 is a parent");
	}
}
class Child extends Parent{
	public void m3() {
		System.out.println("m3 is a child");
	}
}

public class Client {
	public static void main(String[] args) {
		Child child=new Child();
		child.m1();
		child.m2();
		child.m3();
		
	}

}
