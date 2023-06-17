package com.dl.one;

import java.util.*;

public class PosNeg {
	public void print(int num) {
		if(num > 0) {
			System.out.println("positive number");
		}else if(num < 0){
			System.out.println("negitive number");
		}else{
			System.out.println("value zero");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc .nextInt();
		
		PosNeg obj = new PosNeg();
		obj.print(num);
	}

}
