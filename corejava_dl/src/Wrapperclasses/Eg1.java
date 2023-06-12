package Wrapperclasses;

public class Eg1 {

	public static void main(String[] args) {
		// primitive  to object
		// 3 ways using  parameterized constructor
	
		
		// primitive  to object
		
		int i =10;
		System.out.println(i);
		
		// parameterized 
		 Integer integer = new Integer(i);
		 System.out.println("object type" + integer);
		 
		 // value of method
		 
		 Integer valueOf = Integer.valueOf(i);
		 System.out.println("object type" + valueOf);
		 
		 // auto boxing
		 
		 Integer ii = i;
		 System.out.println("object type" + ii);
		
	}

}
