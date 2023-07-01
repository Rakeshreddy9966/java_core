package com.dl.one;

public class edd2 {
//public static void main(String[] args) {
public static void main(String[] args) {
		
		String s1 = "Hello world";
		int count = 0;
		for(int i=0;i<=s1.length()-1;i++) {
			if(s1.charAt(i)=='w') {
				count++;
			}
		}
		System.out.println(count);
	}
}

