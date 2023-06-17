package com.dl.one;
import java.util.*;
public class AddNumbers {
  public void  add(int num1 , int num2) {
	  
            int sum = num1 + num2;
            System.out.println("Add the Numbers : " +sum);
  }
            
            
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the num 1 ");
		 int num1 = sc.nextInt() ;
		 
		System.out.println("Enter the Num2");
		int num2 = sc .nextInt();
		
		AddNumbers obj = new AddNumbers();
		obj.add(num1, num2);
		

	}

}
