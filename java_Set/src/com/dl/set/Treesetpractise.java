package com.dl.set;

import java.util.*;

public class Treesetpractise {
public static void main(String[] args) {
	//TreeSet--->Treemap-->BINARY TREE
	//for sorted array
	// no duplicate
	//accending order
			new Object();//dummy obj
			TreeSet<Integer> ts = new TreeSet<>();
			
			ts.add(5);// theese are keys in hashmap
			ts.add(6);
			ts.add(56);
			ts.add(45);
			ts.add(78);
			ts.add(5);//duplicate is not added in the list
			
			//HashMap<Integer,String> hm = new HashMap<>();
			ts.remove(56);//it is data ,,not index.
			
			System.out.println(ts.remove(45));//true
			
			//verify
			
			ts.contains(78);//true
			
			//no updation 
			
			// extra methods
			
			System.out.println(ts.first());//lowest element
			System.out.println(ts.last());//highest
			System.out.println(ts.pollFirst());//remove lowst element
			System.out.println(ts.pollLast());//remove highest number
			
			//subset means sub
			
			System.out.println(ts.subSet(5, 90));//range 5 to 90; between
			System.out.println(ts.descendingSet());//reverse the entire set
			System.out.println(ts);
			

		}
}

