package com.dl.set;
import java.util.*;
public class Setpractise {

	public static void main(String[] args) {
		//Hashset -->Hashmap -->Array of nodes(key,value)
		new Object();//dummy obj
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(5);// theese are keys in hashmap
		hs.add(6);
		hs.add(56);
		hs.add(45);
		hs.add(78);
		hs.add(5);//duplicate is not added in the list
		
		//HashMap<Integer,String> hm = new HashMap<>();
		hs.remove(56);//it is data ,,not index.
		
		System.out.println(hs.remove(45));//true
		
		//verify
		
		hs.contains(78);//true
		
		//no updation 
		//retrive data(for each loop)
		for(Integer element : hs) {
			System.out.println(element);
		}
		System.out.println(hs);
		

	}

}
