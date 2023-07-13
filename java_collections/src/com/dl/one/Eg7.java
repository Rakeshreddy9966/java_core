package com.dl.one;
import java.util.ArrayList;
public class Eg7 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		System.out.println(list1);//[10, 20, 30, 40]
		
		list1.remove(0);
		System.out.println(list1);//[20, 30, 40]
		
		
		list1.remove(1);
		System.out.println(list1);//[20, 40]
		
		
		list1.remove(0);
		System.out.println(list1);//[40]
		
		list1.remove(0);
		System.out.println(list1);//[]
		
		
	}

}
