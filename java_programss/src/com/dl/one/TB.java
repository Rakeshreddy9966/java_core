package com.dl.one;

import java.util.Scanner;

public class TB {
	public void print(int num) {
	
		for(int i =1;i<=10;i++) {
		System.out.printf(" %d * %d  = %d ", num ,  i , num * i).println();
	}

}public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number: ");
	int number = sc.nextInt();
	
	TB tb = new TB();
	tb.print(number);
}
}