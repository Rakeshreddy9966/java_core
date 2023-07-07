package com.dl.one;

public class Eg2 {
//Array index out of bounce
	public static void main(String[] args) {
		try{int a []= {10,20,30,40,50};
		System.out.println("before");
		System.out.println(a[0]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("after");
	}
	
	
}
