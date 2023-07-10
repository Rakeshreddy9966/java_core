package com.dl.three;

public class ThreadOne extends Thread {

	public void m1() {

		for (int i = 0; i <=5; i++) {
			System.out.println(i + " Non Synchronized Area: ");

		}
		
		synchronized (this) {
			for (int i = 6; i <10; i++) {
				System.out.println(i + " Synchronized Area:");

			}
		}
		
		System.out.println("Non Synchronized Area");
	}
	

}