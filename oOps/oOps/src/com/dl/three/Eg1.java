package com.dl.three;
// Hierarchy -method

class Grandparent{
	public void m1() {
		System.out.println("m1 is a grandfather");
	}
}
class Parent extends Grandparent {
	public void m2() {
		System.out.println("m2 is  a parent");
	}
}
class Child extends Grandparent{
	public void m3() {
		System.out.println("m3 is  a child");
	}
}
public class Eg1 {
	public static void main(String[] args) {
		Child child= new Child();
		child.m1();
		child.m3();
		
		Parent parent = new Parent();
		parent.m2();
		
	}

}
