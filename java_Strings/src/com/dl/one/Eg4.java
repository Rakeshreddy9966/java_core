package com.dl.one;

public class Eg4 {
	public static void main(String[] args) {
		String s1 = new String("Java");
		System.out.println(s1.replace("J", "j"));//java
		
		String s2 = new String("python");
		System.out.println(s2.replace("python", "Java"));//Java
		
		String s3 = new String("Java Programming java Program");
		System.out.println(s3.replaceAll("a", "A"));//JAvA ProgrAmming jAvA ProgrAm
		

		System.out.println(s3.replaceFirst("J", "j"));//java Programming java Program
	}

}
