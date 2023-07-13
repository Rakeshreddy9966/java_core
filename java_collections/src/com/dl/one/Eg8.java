package com.dl.one;
import java.util.ArrayList;
public class Eg8 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add(0,"A");
		list1.add(0,"B");
		list1.add(0,"C");
		list1.add(0,"D");
		list1.add(0,"B");
		list1.add(0,"F");
		
		System.out.println(list1);
		
		System.out.println(list1.indexOf("B"));
		
		System.out.println(list1.indexOf("B"));
		

	}

}
