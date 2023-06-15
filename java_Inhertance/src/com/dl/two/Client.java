package com.dl.two;
// multi level inhertance
class Grandparent{
	public void m2() {
		System.out.println("grandparent");
	}
}
class   Parent extends Grandparent {
	public void m1() {
		System.out.println("parent class");
		
	}
}
class  Child extends Parent{
	public void m3() {
		System.out.println("child class");
	}
}
public class Client {
	public static void main(String[] args) {
		Child child = new Child();
		child.m1();
		child.m3();
		
	}

}
