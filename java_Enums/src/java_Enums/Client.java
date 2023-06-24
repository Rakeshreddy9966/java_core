package java_Enums;

public class Client {
	
	public static void main(String[] args) {
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		
		Gender valueOf = Gender.valueOf("MALE");
		System.out.println(valueOf);
		// Wrapper class
		
		System.out.println(Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
		System.out.println(Integer.BYTES + " "+ Integer.SIZE);
	}

}
