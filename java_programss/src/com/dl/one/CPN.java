package com.dl.one;

import java.util.Scanner;

public class CPN {
	public void print(int num) {
		 int count = 0;
		for(int i =1;i<=num;i++) {
			if(num % i == 0) {
				count ++;
			}
			
		}
		if(count == 2) {
			System.out.println("prime");
			
		}else {
			System.out.println("not prime");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int number = sc.nextInt();
		
		CPN cpn = new CPN();
		cpn.print(number);
}
}