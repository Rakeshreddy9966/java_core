package com.dl.one;

import java.util.LinkedList;
import java.util.ArrayList;

public class Eg11 {

	public static void main(String[] args) {
		//Public boolean add(E e)
		LinkedList<Object> linkedList = new LinkedList<>();
		linkedList.add(null);
		linkedList.add(null);
		linkedList.add(null);
		System.out.println(linkedList);
		
		ArrayList<Object> list1 = new ArrayList<>();
		list1.add(null);
		list1.add(null);
		list1.add(null);
		System.out.println(list1);
		
		LinkedList<Object> linkedList2 = new LinkedList<>();
		linkedList2.add(null);
		linkedList2.add(null);
		linkedList2.add(null);
		System.out.println(linkedList2);
		
		
	}

}
