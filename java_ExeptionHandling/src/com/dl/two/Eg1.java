package com.dl.two;

class A {
	public synchronized void m1() {
	
		for(int i =0;i<=5;i++) {
			System.out.println(i + " "+Thread.currentThread().getName());
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
class B extends Thread{
	A a;

	public B(A a) {
		super();
		this.a = a;
	}
	public void run() {
		a.m1();
	}
}


class C extends Thread{
	A a;

	public C(A a) {
		super();
		this.a = a;
	}
	public void run() {
		a.m1();
	}
}

class D extends Thread{
	A a;

	public D(A a) {
		super();
		this.a = a;
	}
	public void run() {
		a.m1();
	}
}



public class Eg1 extends Thread{
	A a;

	public Eg1(A a) {
		super();
		this.a = a;
	}
	public void run() {
		a.m1();
	}
	public static void main(String[] args) {
		A aa = new A();
		B b = new B(aa);
		C c = new C (aa);
		D d = new D(aa);
		
		b.start();
		c.start();
		d.start();
	}

}
