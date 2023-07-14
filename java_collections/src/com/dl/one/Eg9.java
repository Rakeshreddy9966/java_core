package com.dl.one;

import java.util.ArrayList;

public class Eg9 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		System.out.println(list1);
		
		ArrayList<Integer> list2 = new ArrayList<>(list1);
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(400);
		System.out.println(list2);
	}

}
