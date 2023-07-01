package com.dl.one;
import java.util.*;
public class PN {
		
		public void print(int number) {
			
			for (int i=1;i <=20 ;i++) {
				int count = 0;
			for( int j =1;j<=20;j++) {
				if ( i % j == 0) {
					count++;
					
				}
			}
			if(count ==2) {
			System.out.println("values : " +i);
			
		}
			}
			
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter number: 20");
			int number = sc.nextInt();
			
			PN pn = new PN();
			pn.print(number);
			
	}
	}

