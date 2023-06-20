package com.dl.one;
import java.util.*;
public class SwapNumbers{
	
	public  void swap(int num1, int num2) {
		int
		temp = num1;
		num1=num2;
		num2=temp;
		
		System.out.println("number 1 +" + num1);
		System.out.println("number 2  + "+ num2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("enter the  num1");
		
		int num2 = sc .nextInt();
		System.out.println("enter the num2");
		
		SwapNumbers obj = new SwapNumbers();
	     obj.swap(num1, num2);	
	}

}
