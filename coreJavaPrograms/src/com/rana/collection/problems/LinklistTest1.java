package com.rana.collection.problems;

import java.util.Iterator;
import java.util.LinkedList;

public class LinklistTest1 {
	
	public static void main(String[] rgs) {
		
		
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Rana");
		l1.add("Khan");
		l1.add("Rashid");
		l1.add("Diwakar");
		l1.add("Jay");
		l1.add("Ganesh");
		
		Iterator<String> itr =l1.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
