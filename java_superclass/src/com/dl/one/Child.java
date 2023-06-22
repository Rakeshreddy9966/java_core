package com.dl.one;

public class Child extends Parent {
	int a = 100;
	int b = 200;
	
	public static void main(String []args) {
		Child child = new Child ();
		child.operation();
	}
	public void operation() {
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(super.a);
		System.out.println(super.b);
	}

}
