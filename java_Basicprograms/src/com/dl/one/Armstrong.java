package com.dl.one;


	import java.util.*;
	public class Armstrong {
		
		public void print(int num) {
			int sum = 0;
			int backup = num;
			while(num!=0) {
				sum = sum + (num%10)*(num%10)*(num%10);
				num = num/10;
			}
			System.out.println(sum);
			if(backup == sum) {
				System.out.println("Armstrong Number");
			}else {
				System.out.println("Not Armstrong Number");
			}
		}

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the Number : ");
			int num = sc.nextInt();
			
			Armstrong obj = new Armstrong();
			obj.print(num);

		}

	}


