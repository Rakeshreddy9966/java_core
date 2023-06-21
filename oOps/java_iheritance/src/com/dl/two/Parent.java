package com.dl.two;


class Child{
	public void m1() {
		System.out.println("m1 method");
	}
}
class Client extends Child{
	public static void m2() {
		System.out.println("m2 method");
	}
}
public class Parent extends Client {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.m1();
		m2();
	}

}
