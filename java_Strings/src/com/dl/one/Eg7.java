package com.dl.one;

public class Eg7 {
	public static void main(String[] args) {
		
	
String s1 = new String("I Like Java I like python and i like javascript");
System.out.println(s1.lastIndexOf("Like"));//36
System.out.println(s1.indexOf("Like"));//2
System.out.println(s1.indexOf("like" , 7));//18


String s2 = "Java";
System.out.println(s2.toUpperCase());//"JAVA"
System.out.println(s2.toLowerCase());//"java"


}
}