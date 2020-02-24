package com.rana.collection.problems;

import java.util.ListIterator;
import java.util.Stack;
public class StackTest1 {

	public static void main(String[] args) {
		
		Stack<String> stack1 = new Stack<String>();
		
		stack1.push("rana");
		stack1.push("shyam");
		stack1.push("krishna");
		stack1.push("rashid");
		stack1.push("meera");
		stack1.push("teena");
		
		ListIterator<String> itr = stack1.listIterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("****************************************************");

		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		
		System.out.println("****************************************************");
		
		for(String str : stack1)
			System.out.println(str);
	}

}
