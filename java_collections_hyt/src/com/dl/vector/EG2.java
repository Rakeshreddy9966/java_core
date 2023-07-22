package com.dl.vector;
import java.util.*;
//generics=1.5
//vector is 1.0 version
//collections =1.2
//
public class EG2 {
public static void main(String[] args) {
	Vector<Integer> v1 = new Vector<>();
	//v1.add("Rakesh");
	v1.add(12);
	 int sum = 0;
	 for(int i =0;i < v1.size();i++) {
		 sum += (Integer) v1.get(i);
	 }
	System.out.println(v1);
	System.out.println(v1.size());
	System.out.println(v1.capacity());
}
}
