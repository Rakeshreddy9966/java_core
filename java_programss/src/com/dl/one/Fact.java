package com.dl.one;

import java.util.Scanner;

public class Fact {
 public void print(int num) {
	int  fact = 1;
	for(int i = 1;i<=num;i++) {
		fact= fact *i;
	}
	System.out.println(fact);
	 
 }
 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int number = sc.nextInt();
		
		Fact fact  = new Fact();
		fact.print(number);
}
}
