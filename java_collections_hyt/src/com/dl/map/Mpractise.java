package com.dl.map;
import java.util.*;
import java.util.Map.Entry;

public class Mpractise {

	public static void main(String[] args) {
		// creation of map
		Map <Integer,String> m = new HashMap<>();
		
		//adding elements to map
		m.put(158222, "Kurnool");
		m.put(518216, "Dhone");
		m.put(500050, "Hydreabad");
		
		// retrival of keys from map
			Set < Integer> keys = m.keySet();
			for( Integer key : keys){
				System.out.println(key);
			}
			
		// retrival of values from map
			// values will give collection of strings will return because value is  string
			Collection<String> values = m.values();
			for(String value : values) {
				System.out.println(value);
			}
		//  retrival of data by key
			System.out.println(m.get(518216));
			
		// by using for each we can get all values in map
			
			for(Integer key : keys) {
				System.out.println(key + ">>>>>>>>" +"m.get(key)");
			}
			
		System.out.println(m);
	//Deletion of elements
		
// verification of key and by values
		System.out.println(m.containsKey(518216));
		System.out.println(m.containsValue("kurnool"));
		
		
		//Updation of elements
		// we have to add by put method // reassign we have to do
		m.put(123466,"delhi");
	
	
	// put itifabsent we are not updating we are inserting
		
		m.putIfAbsent(12346, "goa");
		
		// update also we can replace method
		
		m.replace(123456, "ghoa");
		
		m.clear();

		// get all keys and values
		Set<Entry<Integer,String>> entries = m.entrySet();
		for(Entry<Integer,String> entry : entries) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ">>>>>"+ value);
		}
		
	}

}
