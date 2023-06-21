package com.dl.five;

// in abstract class we can declare multiple abstract methods but we can also provide only single method implementation 
//of sub class in all other implements we 
// can take in other class by using muti-level inheritance

abstract class Parent {
	abstract void m1();
	abstract void m2();
	abstract void m3();
	abstract void m4();
	
}
abstract class child extends Parent{
	@Override
	void m1() {
		System.out.println("m1 method");
		
	}
	@Override
	void m2() {
		System.out.println("m2 method");
		
	}
}
class Children extends child{
	@Override
	void m3() {
		System.out.println("m3 method");
		
	}
	@Override
	void m4() {
		System.out.println("m4 method");
		
	}
}
public class Client {

	
	public static void main(String[] args) {
		
    Children children = new Children();
    children.m1();
    children.m2();
    children.m3();
    children.m4();
    
    
	}

}
