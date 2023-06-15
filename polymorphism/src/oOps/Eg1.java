package oOps;
// poly many forms
// method overloading( one class, method name must be same,agrs can be different)
//method overriding(multiple class,method name must be same,args can be same)
//method overloading
public class Eg1 {
	
	public void gasStation(int pprice , int dprice) {
		System.out.println("petrol price : "+pprice);
		System.out.println("petrol price : "+dprice);
		
	}
	public void gasStation(float pprice , float dprice) {
		System.out.println("petrol price 2 : "+pprice);
		System.out.println("petrol price 2 : "+dprice);
		
	}

	public static void main(String[] args) {
		Eg1 eg=new Eg1();
		eg.gasStation(100, 80);
		eg.gasStation(100.2f, 80.5f);

	}

}
