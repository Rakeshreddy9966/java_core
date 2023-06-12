package Wrapperclasses;

public class Eg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // string to object
		
		String s1 = "NoName";
		System.out.println(s1);
		
		//1 value of
		
		String valueOf = s1.valueOf(s1);
		System.out.println(valueOf);
		
		//parametrized constructor
		
		String s2 = new String(s1);
		System.out.println(s2);
		
		
		///object to string
		
		String s11 = new String("10");
		System.out.println(s11);
		
		//1 to string
		
		String string = s11.toString();
		System.out.println(string);
		
		// + operator
		System.out.println("\n");
		
		s11.toString();
		System.out.println(s1 + " " +string);
		
	}

}
