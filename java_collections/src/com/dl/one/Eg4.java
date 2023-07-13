package com.dl.one;
import java.util.ArrayList;
//Add all method
public class Eg4 {
public static void main(String[] args) {
	ArrayList<Integer> list1 = new ArrayList<>();
	list1.add(0,10);
	list1.add(20);
	list1.add(30);
	list1.add(3,40);
	list1.add(50);
	
	ArrayList<Integer> list2 = new ArrayList<>();
	list2.add(60);
	list2.add(70);
	list2.add(80);
	list2.add(90);
	list2.add(100);
	
	list1.addAll(2, list2);
	System.out.println(list1);//[10, 20, 60, 70, 80, 90, 100, 30, 40, 50]

	
	
	
	
}
}
