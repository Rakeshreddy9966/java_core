package com.dl.one;
//class  not founnd exception
public class Eg6 {
public static void main(String[] args) {
	try {
		Class.forName("com.dl.one.JDBC");
	} catch (ClassNotFoundException e) {
		System.out.println(e);
	}
	}
}

class JDBC{
	static {
		System.out.println("JDBC driver called");
	}
}

