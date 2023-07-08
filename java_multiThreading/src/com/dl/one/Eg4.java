package com.dl.one;
//get priority
//set priority
public class Eg4 extends Thread{
	public static void main(String[] args) {
		Eg4 e1 = new Eg4();
		Eg4 e2 = new Eg4();
		Eg4 e3 = new Eg4();
		
		System.out.println(e1.getPriority());
		System.out.println(e2.getPriority());
		System.out.println(e3.getPriority());
		
		e1.setPriority(6);
		e2.setPriority(7);
		e3.setPriority(8);
		
		System.out.println(e1.getPriority());
		System.out.println(e2.getPriority());
		System.out.println(e3.getPriority());
		
		
		e1.setPriority(MAX_PRIORITY);
		e2.setPriority(MIN_PRIORITY);
		e3.setPriority(NORM_PRIORITY);
		
		System.out.println(e1.getPriority());
		System.out.println(e2.getPriority());
		System.out.println(e3.getPriority());
		
		
	}

}
