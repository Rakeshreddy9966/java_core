package com.dl.one;

import java.util.ArrayList;
import java.util.LinkedList;
public class Eg12 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("A");
		arrayList.add("D");
		arrayList.add("B");
		arrayList.add("C");
		
		System.out.println(arrayList);
		arrayList.sort(null);
		System.out.println(arrayList);
		
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("A");
		linkedlist.add("D");
		linkedlist.add("B");
		linkedlist.add("C");
		
		System.out.println(linkedlist);
		linkedlist.sort(null);
		System.out.println(linkedlist);
		
		
		
		
		

	}

}
