package com.dl.one;

public class Eg3  extends Thread{
	public static void main(String[] args) {
		Eg3 eg3 = new Eg3();
		System.out.println(eg3.getName());
	    Thread.currentThread().setName("custom exception or custom Thread name");
	    System.out.println(Thread.currentThread().getName());
	}

}
