package com.dl.one;

import java.util.Scanner;

public class RN {
	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number: ");
			int num = sc.nextInt();
			 int rev = 0;
			while(num!=0) {
				rev = rev *10 +(num%10);
				num = num /10;
			}
			System.out.println(rev);
}
}