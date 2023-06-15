package com.dl.three;

// hierarchy method
class Grandfather {
	public void m1() {
	System.out.println("m1 method");	
	}
}
class Father extends Grandfather{
	public void m2() {
		System.out.println("m2 method");
	}
}
class Child extends Grandfather{
	public void m3() {
		System.out.println("m3 method");
	}
}
public class Client {
	public static void main(String[] args) {
//		Child child = new Child();
//		child.m1();
//		child.m3();
		
		Father father= new Father();
		father . m1();
		father.m2();
		
		
		
	}

}
