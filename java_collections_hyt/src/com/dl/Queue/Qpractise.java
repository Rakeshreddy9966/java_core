package com.dl.Queue;
import java.util.*;
public class Qpractise {
//*** when we use peek without elements 
	//queue is an object type of array so null is also will be printed
	//Comparator.reverseOrder() used for decending order
	//default acending order
	//default value is 11
	
	
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();//Comparator.reverseOrder()used for decending order
		 pq.add(8);
		 pq.offer(2);
		 pq.offer(5);
		 pq.add(7);
		 System.out.println(pq);
		 //retrival only head elememnt will be given.//2
		 System.out.println(pq.peek());
		 
		 //removal  
		 pq.poll();
		 System.out.println(pq);
		 		 
		 //Addition -offer,add
		 //retrival - peek
		 //removal-poll,remove
//		 while (!pq.isEmpty()) {
//			 System.out.println(pq.poll());//only poll and peek usd to get the priority
//		 }

	}

}
