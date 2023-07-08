package com.dl.one;
// we can get different active count beacause of execution of the thread .
// we cannot get expected output
public class Eg5 {
	public static void main(String[] args) {
		
		Thread t1=new Thread();
		t1.start();
		System.out.println(t1.isAlive());
		
		Thread t2=new Thread();
		t2.start();
		System.out.println(t2.isAlive());
		
		System.out.println(Thread.activeCount());
		
		
	}

}
