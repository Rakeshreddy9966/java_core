package com.dl.one;

import java.util.Scanner;



public class Eg2{
	
	
		
	public static void main(String[] args) {
		String s1 = new String("A");
		String s2 = new String ("B");
		String s3 = new String("A");
		
		System.out.println(s1.compareTo(s2));//-1 65-66
		System.out.println(s2.compareTo(s3));//1  66-65
		System.out.println(s1.compareTo(s3));//0 65-65
		
		
		String s4 = new String("A");
		String s5 = new String ("a");
		System.out.println(s4.compareTo(s5));  // -32  65-97 
		System.out.println(s2.compareToIgnoreCase(s5)); // 0 63-65
		
		
}
}