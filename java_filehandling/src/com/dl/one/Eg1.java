package com.dl.one;

import java.io.IOException;
import java.io.File;

public class Eg1 {
	public static void main(String[] args)  throws IOException{
		File f1 = new File("cat.txt");
		f1.createNewFile();
		System.out.println("file created");
		
		File f2 = new File("src/bat.txt)");
		f2.createNewFile();
		System.out.println("file created");
		
		File f3 = new File("C:\\Users\\saner\\Desktop\\dl frontend\\loginpage)\\rat.txt");
		f3.createNewFile();
		System.out.println("file created");
		
		
	}

}
