
package com.dl.one;
import java.util.ArrayList;
public class Eg6 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		System.out.println(list1);//[10, 20, 30, 40]
		System.out.println(list1.size());//4
		
		System.out.println(list1.get(2));//30
		System.out.println(list1.get(3));//40
		
		
	}

}
