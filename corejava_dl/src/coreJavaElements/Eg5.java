package coreJavaElements;

public class Eg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		m1();
		 new Eg5().m2();
				 
		 System.out.println("m3");
		 System.out.println("getMethod");
	}
	
	
	// static method
	public static void m1() {
		System.out.println("static");
	}
	//instance method
	public void m2() {
		System.out.println("instance");
		
	}
	//return type integer
	public int m3 () {
	  return 0;
	}
	
	// string type
	 public String getMethod() {
		 return "https";
		 
	 }
	

}
