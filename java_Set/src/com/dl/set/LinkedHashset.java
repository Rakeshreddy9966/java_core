package com.dl.set;
import java.util.*;

public class LinkedHashset {
	public static void main(String[] args) {
		//linked hashset is internal implementation is linked hashmap
		
		//LinkedHashset -->LinkedHashmap -->Array of nodes(key,value)
				new Object();//dummy obj
				LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
				
				lhs.add(5);// theese are keys in hashmap
				lhs.add(6);
				lhs.add(56);
				lhs.add(45);
				lhs.add(78);
				lhs.add(5);//duplicate is not added in the list
				
				//HashMap<Integer,String> hm = new HashMap<>();
				lhs.remove(56);//it is data ,,not index.
				
				System.out.println(lhs.remove(45));//true
				
				//verify
				
				lhs.contains(78);//true
				
				//no updation 
				//retrive data(for each loop)
				for(Integer element : lhs) {
					System.out.println(element);
				}
				System.out.println(lhs);
				

			
	}

}
