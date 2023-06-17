package com.dl.one;
import java.util.*;
public class CheckPrime {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int count = 0;
		for(int i = 1;i <=num;i++) {
			if(num % i == 0) {
				count++;
				
			}
		}
		if(count ==2) {
			System.out.println("prime");
		}else {
			System.out.println("non prime");
		}
	}
	}
