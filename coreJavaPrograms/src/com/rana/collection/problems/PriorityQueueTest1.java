package com.rana.collection.problems;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTest1 {

	public static void main(String[] args) {
		
		Queue<String> q = new PriorityQueue<String>();
		
		q.add("rama");
		q.add("shyam ");
		q.add("krishna");
		
		System.out.println(q);
		
		Iterator itr=q.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next()); } 
		System.out.println("*******************************");
		
	System.out.println(q.poll());
	System.out.println(q.poll());
	System.out.println(q.poll());
	System.out.println(q.poll());
	

	}
}