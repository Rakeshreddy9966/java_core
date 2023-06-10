package Wrapperclasses;

public class Eg1 {

	public static void main(String[] args) {
		// primitive  to object
		// 3 ways using  parameterized constructor
		int i =10;
		System.out.println("primitive Type: " + i);
		
		Integer integer = new Integer(i);
		System.out.println("object type :"+ integer);
		//using value of method
		int j=10;
		System.out.println("primitive Type: " + i);
		Integer valueOf = Integer.valueOf(j);
		System.out.println("object type:" + valueOf);
		
		//auto boxing primitive to object
		
		int k =10;
		System.out.println("primitive type" + k);
		Integer auto = k;
		System.out.println("object type:" + auto);
		

	}

}
