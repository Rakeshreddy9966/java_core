package coreJavaElements;

public class Eg6 {
	
	public void m1 (int a , int b){
		System.out.println(a+b);
	}
	public static void m2(int x, int y) {
		System.out.println(x/y);
	}
	
	public static void main(String[] args) {
		
		Eg6 eg6 = new Eg6();
		
		eg6.m1(10, 20);
		eg6.m1(10, 30);
		eg6.m1(20, 30);
		
		m2 (15,5);
		m2 (10,2);
		
		
	}
	


}
