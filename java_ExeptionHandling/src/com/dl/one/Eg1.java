package com.dl.one;
//arthematic expression
public class Eg1 {
public static void main(String[] args) {
	try{int a = 10;
	int b = 20;
	int c = 0;
	System.out.println("before");
	System.out.println(a/b);
	System.out.println(a/c);
	}catch(ArithmeticException e) {
	System.out.println(e);
	}
	System.out.println("after");
	
}

}
