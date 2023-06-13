package controlstatements;

public class Eg3 {

	public static void main(String[] args) {
		// else if condition
		//it checks condition and next condition simentanously
		
		double userSalary = 10000.00;
		
		if(userSalary == 10000.00) {
		System.out.println("UserSalary is " + userSalary);
		}else if(userSalary == 20000.00) {
			System.out.println("userSalary is "+ userSalary);
			
		}else if(userSalary == 30000.00) {
			System.out.println("userSalary is "+ userSalary);
		}else {
			System.out.println("error");
		}
			
		

	}

}
