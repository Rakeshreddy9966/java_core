package com.dl.two;
enum Books{
	JAVA,JAVASCRIPT,PYTHLON
}
public class Client {
	public static void main(String[] args) {
		Books[] values = Books.values();
		for (Books books : values) {
			System.out.println(books);
			System.out.println(books.ordinal());
		}
	}

}
