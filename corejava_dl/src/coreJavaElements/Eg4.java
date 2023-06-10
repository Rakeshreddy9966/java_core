package coreJavaElements;
//instance variable / static variable
public class Eg4 {
   String id="9966";
   String username="Rakesh";
   static long l =9966473596l ; 
   
	public static void main(String[] args) {
		Eg4 eg4 = new Eg4();
		eg4.getuserDetails();
		
		System.out.println("-----------------------");
		getuserDetailstwo();
		System.out.println("-----------------------");	

	}

	
	//Instance method
	public void getuserDetails() {
		System.out.println("instance method :" + id );
		System.out.println("instance method : "+ username);
		System.out.println("instance method: " + l);
		
	}
	
	// static method
	
	public static void getuserDetailstwo() {
		System.out.println("static method : "+ new Eg4().id );
		System.out.println("static method : "+ new Eg4().username);
		System.out.println("static method :" + l);
	}
}
