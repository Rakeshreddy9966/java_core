package com.dl.three;
class GrandParent{
	public void m1() {
		System.out.println("m1 method");
	}
}
class Parent extends GrandParent{
	public void m2() {
		System.out.println("m2 method");
	}
}
class Child extends GrandParent{
	public void  m3()
{
		System.out.println("m3 method");}
}


public class Client {
	public static void main(String[] args) {
  Child ch1 =new Child();
  ch1.m1();
  ch1.m3();
 
		
		
	}

}
