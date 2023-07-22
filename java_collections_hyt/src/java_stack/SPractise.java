package java_stack;
import java.util.*;
public class SPractise {

	public static void main(String[] args) {
		//LIFO ---> STACK
		//FIFO ---> QUEUE
		
	//	Stack is a class in java which implents list and extends Vector class 
		//and also represents the LIFO principle. 
		
		Stack<String> books = new Stack<>();
		books.push("White");
		books.push("red");
		books.push("Black");
		
		//System.out.println(books.search("red"));
		System.out.println(books);//[White, red, Black]
		System.out.println(books.pop());//Black
		System.out.println(books);//[White, red,]
		
		System.out.println("-------------");
		System.out.println(books.search("White"));//2  Because 0)black 1)red  2)white
		System.out.println(books);//[White, red]
		System.out.println(books.peek());//red
		
		System.out.println(books.empty());//false
	}

}
