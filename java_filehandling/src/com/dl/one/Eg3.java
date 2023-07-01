package com.dl.one;
import java.io.FileWriter;
import java.io.IOException;
public class Eg3 {
public static void main(String[] args) throws IOException {
	FileWriter writer = new FileWriter("Users\\saner\\Desktop\\dl frontend/camel.txt");
	writer.write("Hello Java and Heelo Python");
	writer.close();
	System.out.println("file created");
}
}
