package com.dl.one;
import java.io.*;
public class Eg7 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter name");
		String readLine = reader.readLine();
		System.out.println(readLine);
		
		System.out.println("enter name");
		int read = reader.read();
		System.out.println((char)read);
		reader.close();
		}

}
