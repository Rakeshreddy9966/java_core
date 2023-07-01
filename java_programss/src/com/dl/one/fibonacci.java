package com.dl.one;

import java.util.Scanner;

public class fibonacci {
 public void print(int num) {
	  
		int n1 = 0;
		int n2 = 1;
		
		int sum = 0;
		int i =1;
		while(i<=num) {
			sum = n1+n2;
			System.out.println( sum + " ");
			i++;
			n1=n2;
			n2=sum;
		
		}
	 
 }
 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number: ");
		int number = sc.nextInt();
		
		fibonacci  fib = new fibonacci();
	     fib.print(number);
}
}
