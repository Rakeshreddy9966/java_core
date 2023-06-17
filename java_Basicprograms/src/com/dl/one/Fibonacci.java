package com.dl.one;
import java.util.*;
public class Fibonacci {
	
	public void print(int number) {
		int n1 =0;
		int n2=1;
		int sum=0;
		
		System.out.print(n1 + " " + n2);
		//System.out.print(n2);
		
		for(int i=2;i<=number;i++) {
			sum = n1 + n2;
			n1 = n2;
			n2 = sum;
			System.out.print(" " + sum);
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		
		Fibonacci obj = new Fibonacci();
		obj.print(number);

	}

}