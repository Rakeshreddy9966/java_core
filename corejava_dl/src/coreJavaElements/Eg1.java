package coreJavaElements;
// instance method
public class Eg1 {
    
	public static void main(String[] args) {
		Eg1 eg1 = new Eg1();
		
		eg1.add();
		eg1.delete();
		
		Eg1 eg2 = new Eg1();
		
		eg2.add();
		eg2.delete();
		

	}

		

	//Instance method
	public void add() {
		System.out.println("add method");
	}
	//delete method
	public void delete() {
		System.out.println("Delete method");
	}

}
