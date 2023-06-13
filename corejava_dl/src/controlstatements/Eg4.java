package controlstatements;

public class Eg4 {

	public static void main(String[] args) {
		// switch case
		// difference b/w else if and switch case is performance wise switch case is fast in else if it take time to
		//go condition by condition
		
		int userSalary = 5000;
		
		switch(userSalary) {
		case 1000:
		System.out.println("UserSalary is "+ userSalary);
		break;
		
		case 2000:
			System.out.println("UserSaalary is"+ userSalary);
			break;
		default:
			System.out.println("error");
		}

	}

}
