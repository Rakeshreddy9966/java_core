package controlstatements;

public class Eg1 {

	public static void main(String[] args) {
		// section statement
		// direct value gives dead code
		if(true) {
			System.out.println("if statement");
			
		}else {
			System.out.println("else statement");
			
		}
		// dead code will not exicute the function
		if(false) {
			System.out.println("else statement");
			
		}else {
			System.out.println("if statement");
		}
		if(true) {
			System.out.println("if statemenyt");
		}
	}

}
