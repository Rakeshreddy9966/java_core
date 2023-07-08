package com.dl.one;
// creating a thread by extending thread class
public class Eg1 extends Thread {

	public static void main(String[] args) {
		Eg1 eg1 = new Eg1();
		eg1.start();
	}
	public void run() {
		System.out.println("run metod");
	}
	
}
//run()
//start()