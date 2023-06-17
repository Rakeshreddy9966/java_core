package com.dl.one;
import java.util.*;
public class EvenOdd {
	
	public void print( int num) {
		if(num % 2 == 0) {
			System.out.println("even number");
			
		}else {
			System.out.println("odd number");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter number");
		int num = sc.nextInt();
		
	 EvenOdd obj = new EvenOdd();
	 obj.print(num);
	}

}
