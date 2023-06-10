package Wrapperclasses;

public class Eg2 {

	public static void main(String[] args) {
		
		int i =10;
		System.out.println("primitive type");
		
		Integer ii = 20;
		System.out.println("object type");
		
		//object to primitive type
		//long value
		Long navenContactNo = 987654321L;
		Long contactNo = new Long(navenContactNo);
		System.out.println("Object type: " + contactNo);
		long longValue = contactNo.longValue();
		System.out.println("primitive Type:" + longValue);
		
		// auto un -boxing
		
		
		
	}

}
