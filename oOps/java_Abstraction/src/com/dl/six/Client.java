package com.dl.six;
// we can extend non abstract class from abstract class using multilevel inheritance

class p1{
	public void m1() {
		System.out.println("m1 method");
	}
}
abstract class p2 extends p1 {
	public void m2() {
		System.out.println("m2 method");
	}
	
}
class P3 extends p2{
	public void m3() {
		System.out.println("m3 method");
	}
}
public class Client {
	public static void main(String[] args) {
		P3 p3 = new P3();
		p3.m1();
		p3.m2();
		p3.m3();
	}

}
