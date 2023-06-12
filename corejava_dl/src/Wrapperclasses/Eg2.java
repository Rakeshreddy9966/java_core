package Wrapperclasses;

public class Eg2 {

	public static void main(String[] args) {
		
		int i =10;
		System.out.println("primitive type");
		
		Integer ii = 20;
		System.out.println("object type");
		
		//object to primitive type
		// para 
		Integer i1 = new Integer(10);
		System.out.println(" object type" + i1);
		
		int intValue = i1.intValue();
		System.out.println("primitive type " + intValue);
		
		// auto un -boxing
		
		Integer ii1 = new Integer(20);
		System.out.println("ob type"+ ii1);
		
		Integer iii = ii1;
		System.out.println(" primitive"+ iii);
		
		
		
	}

}
