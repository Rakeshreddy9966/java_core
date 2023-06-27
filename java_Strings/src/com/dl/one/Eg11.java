package com.dl.one;

public class Eg11 {
	public static void main(String[] args) {
//		String s1 = "java";
//		System.out.println(s1);
//		
//		String s2=new String ("java");
//		System.out.println(s2);
//		
//		String s3 = new String("python");
//		
//		String s4 = ("java");
//		
//		
//		
//		 // == ref  // .equal content
//		System.out.println(s1 == s4);
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equals(s4));
		
		
		//compareto and comparetoignorecase
		
		
//		String s1 = new String("A");
//		String s2 = new String("B");
//		String s3 = new String ("c");
//		String s4 = new String("a");
//		
//		System.out.println(s1 .compareTo(s3));
//		System.out.println(s2.compareTo(s1));
//		
//		System.out.println(s1.compareToIgnoreCase(s4));
		
		
		//startwith // endwith // content
		
		
//		String s1 = "RAKESH";
//		System.out.println(s1.startsWith("R"));
//		
//		String s2 = new String("Shankar");
//		System.out.println(s2.endsWith("S"));
//		
//		String s3 =  new String ("Java and python");
//		System.out.println(s3.contains("and"));
		
		
		//replace // replaceall
		
//		String s1 = new String("JAVA");
//		System.out.println(s1.replace("J", "j"));
//		
//		String s2 = new String("Java and python");
//		System.out.println(s2.replaceAll("a", "A"));
		
		// INDEXOF // LAST INDEXOF // TO LOWERCASE  // TO UPPERCASE
//		

		
//		String str = "Hello, World!";
//        char[] characters = str.toCharArray();
//        int start = 0;
//        int end = str.length() - 1;
//        while (start < end) {
//            char temp = characters[start];
//            characters[start] = characters[end];
//            characters[end] = temp;
//            start++;
//            end--;
//        }
//        String reversed = new String(characters);
//        System.out.println(reversed);
		String s = "hello";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
    
	
}
