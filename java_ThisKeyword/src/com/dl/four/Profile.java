package com.dl.four;
// this keyword pass an argument in the method
public class Profile {
public void add(Profile profile) {
	System.out.println("add method");
}
public void update() {
	add(this);
	delete();

	System.out.println("update method");
	

}
public void delete() {
	System.out.println("delete method");
}
public static void main(String[] args) {
	Profile profile = new Profile();
	profile.update();
}
}
