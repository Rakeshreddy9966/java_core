package com.dl.three;

public class Test extends Thread {

	ThreadOne threadOne;

	public Test(ThreadOne threadOne) {
		super();
		this.threadOne = threadOne;
	}
	
	@Override
	public void run() {
		threadOne.m1();
	}
	
	public static void main(String[] args) {
		
		ThreadOne one = new ThreadOne();
		Test test = new Test(one);
		test.start();
	}
}