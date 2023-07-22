package com.dl.vector;
import java.util.*;
//  list interface has both vector and arraylist 
// in vector list can be increased to 100%(first it has 10 size of capacity)
//but in arraylist it can only increased to 50%.

//size is element size
//capacity means array capacity
public class vector {
	public static void main(String[] args) {
		Vector<String> v1 = new Vector();
		v1.add("rak");
		v1.add("raj");
		v1.add("sai");
		v1.add("nikil");
		v1.add("gana");
		v1.add("dl1");
		v1.add("dl2");
		v1.add("dl3");
		v1.add("dl5");
		v1.add("dl4");
		v1.add("d16");
		
//	   Vector v2 = new Vector();
//	     v2.addAll(v1);
//	   System.out.println(v2);
		
//		System.out.println(v1.remove("sai"));
//		System.out.println(v1.set(0, "Rani"));
//		System.out.println(v1.get(2));
//		System.out.println(v1.contains("d13"));
		
		
//	System.out.println(v2.size());
//		System.out.println(v2.capacity());
		
		
		
		System.out.println(v1);
	}

}
