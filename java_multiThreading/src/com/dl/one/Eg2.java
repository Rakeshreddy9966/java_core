package com.dl.one;
//creating a thread by implements runnable interface
public class Eg2 implements Runnable {
	public static void main(String[] args) {
		Eg2 eg2 = new Eg2();
		
		Thread t1 = new Thread(eg2);
		t1.start();
		Thread t2 = new Thread(eg2);
		t2.start();

	}

	@Override
	public void run() {
		System.out.println("run method");
		
	}

}
