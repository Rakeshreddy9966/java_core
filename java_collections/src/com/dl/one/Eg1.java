package com.dl.one;
import java.util.*;
import java.util.ArrayList;
public class Eg1 {
	public static void main(String []args) {
		//add(index, element)
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0,10);
		list.add(1,20);
		list.add(2,30);
		list.add(3,40);
		System.out.println(list);
		
		list.add(4,50);
		System.out.println(list);
	}

}
