package com.rana.collection.problems;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest1 {

	public static void main(String[] args) {
		
		Vector<String> vec = new Vector<String>();
		vec.add("rana");
		vec.add("Shyam");
		vec.add("khan");
		
		Iterator<String> itr = vec.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
