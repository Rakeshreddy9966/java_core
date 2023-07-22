package com.dl.ArrayList;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,2,5,6,8};//creation
		ArrayList <Integer> A1 = new ArrayList<>(Arrays.asList(arr));
		A1.add(10);
		System.out.println(A1);
		System.out.println(A1.size());
		A1.add(12);//addition
		A1.get(3);//retrive
		A1.remove(2);//delete
		System.out.println(A1.contains(5));//verify
		A1.set(0,25);//update
		A1.indexOf(A1);
		//lastindex,firstindex
		//interation and for each
		for  ( Integer integer : A1) {
			System.out.println(integer);
		}
		//System.out.println(A1);
		
		Collections.synchronizedList(A1);//vector 
	}

}
