package com.dl.one;

import java.util.Scanner;

public class SM {
	public void sum(int num) {
		int sum = 0;
		for(int i =0; i <=num; i ++) {
			sum = sum+i;
		}
		System.out.println("values "+ sum);
	}
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int number = sc.nextInt();
		
		SM sm = new SM();
		sm.sum(number);
}
}
