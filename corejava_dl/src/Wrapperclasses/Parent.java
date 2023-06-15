package Wrapperclasses;

//  constructor overloading
//  constructor name must be same as class name
// constructor name must be same args must be diff
public class Parent {
	public Parent () {
		System.out.println("default constructor");
	}
public Parent (int a) {
	 System.out.println(a);
}
public static void main(String[] args) {
	new Parent();
	new Parent(10);
}
}


// no constructor overriding must be possible because 
// if class is different constructor will not be insiate.
