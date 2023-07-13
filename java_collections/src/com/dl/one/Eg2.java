package com.dl.one;
import java.util.ArrayList;
public class Eg2 {
public static void main(String[] args) {
	ArrayList<String>list = new ArrayList<>();
	list.add(0,"NameZERO");
	list.add(1,"Name One");
	list.add(2,"Nametwo");
	list.add(3,"NameThree");
	System.out.println(list);
	System.out.println(list.size());
	
	list.add(2,"name two dupilicate");
	System.out.println(list);
	System.out.println(list.size());
}
}
