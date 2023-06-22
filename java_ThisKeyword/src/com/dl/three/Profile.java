package com.dl.three;
//this keyword refers  to the current class constructor
public class Profile {
     public Profile() {
	 this(10,20);
	 System.out.println("default cons");
	 
 }
	 public Profile (int a ) {
		 System.out.println(a);
	 }
     public Profile (int a , int b) {
    	 this(100);
    	 System.out.println(a);
    	 System.out.println(b);
     }
     public static void main(String[] args) {
		new Profile();
	}
}
