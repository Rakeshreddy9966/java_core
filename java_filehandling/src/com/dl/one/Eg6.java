package com.dl.one;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.*;
public class Eg6 {
public static void main(String[] args) throws IOException{
	System.out.println("enter  number");
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String readLine = reader.readLine();
	int parseInt = Integer.parseInt(readLine);
	System.out.println(parseInt);
	reader.close();
}
}
