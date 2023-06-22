package com.dl.three;

public class Child extends Parent {
public Child(){
	this(10);
	System.out.println("child deafult cons");
	
}
public Child(int a) {
	super(12);
	System.out.println("child one -arg cons");
}
public Child(int a , int b) {
	super();
}
public static void main(String[] args) {
	new Child();
	new Child(10,20);
}
}
