package com.dl.one;

import java.util.LinkedList;

public class Eg13 {

	public static void main(String[] args) {

		
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
		
		linkedList.addFirst(1000);
		System.out.println(linkedList);
		
		linkedList.addLast(1000);
		System.out.println(linkedList);
		
		System.out.println(linkedList.getFirst());
		
		System.out.println(linkedList.getLast());
		
		linkedList.removeFirst();
		System.out.println(linkedList);
		
		linkedList.removeLast();
		System.out.println(linkedList);
		
			}

}
