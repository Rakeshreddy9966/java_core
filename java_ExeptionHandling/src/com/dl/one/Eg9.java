package com.dl.one;


class A extends Thread{
	public void run() {
		for(int i = 0;i<=5;i++) {
			System.out.println("A" + i);
			
			Thread.yield();
		}
	}
}
class B extends Thread{
	public void run() {
		for(int i = 6;i<=10;i++) { 
			System.out.println("B" + i);
			
			Thread.yield();
		}
		
	}
}
public class Eg9 {
	public static void main(String[] args) {
		Thread a = new A();
		a.setPriority(Thread.MIN_PRIORITY);
		a.start();
		Thread b = new B();
		b.setPriority(Thread.MAX_PRIORITY);
		b.start();
	}
	
	

}
