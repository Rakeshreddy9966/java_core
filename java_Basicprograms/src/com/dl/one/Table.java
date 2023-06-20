package com.dl.one;

import java.util.Scanner;

public class Table {
	public void print(int num) {
		for( int i=1;i<=10;i++) {
			System.out.printf("%d * %d = %d" ,num , i , num * i). println();
		}
	}
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter num");
	int num = sc.nextInt();
	
	Table obj = new Table();
	obj.print(num);
}
}