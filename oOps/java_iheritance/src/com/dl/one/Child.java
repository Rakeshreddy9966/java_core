package com.dl.one;

public class Child  extends Parent{
	
	public int add(int a ,int b) {
		return a+b;
		
	}
	public static void main(String[] args) {
		Child ch1 = new Child();
		System.out.println(ch1.add(20, 1000));
		ch1.add();
		put();
	}

	
}
