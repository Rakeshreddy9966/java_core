package com.dl.one;

import java.util.LinkedList;

public class Eg10 {

	public static void main(String[] args) {
// add,get,remove
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(0, 10);
		linkedList.add(1, 20);
		linkedList.add(2, 30);
		linkedList.add(3, 40);
		linkedList.add(4, 50);
		linkedList.add(5, 60);
		linkedList.add(6, 70);
		linkedList.add(7, 80);
		System.out.println(linkedList);
		
		System.out.println(linkedList.get(4));
		
		System.out.println(linkedList.remove(6));
		
		System.out.println(linkedList);
	}

}
