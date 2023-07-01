package com.dl.one;

import java.io.File;

public class Eg2 {
public static void main(String[] args) {
	File f1 = new File("Spring");
	boolean mkdir = f1.mkdir();
	System.out.println(mkdir);
	
	File f2 = new File("corejava // Advancejava // spring");
	boolean mkdirs = f2.mkdirs();
	System.out.println(mkdirs);
}
}
