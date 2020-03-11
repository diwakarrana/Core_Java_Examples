package com.rana.property;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Property2 {

	public static void main(String[] args) {
		Properties p = System.getProperties();
		Set set = p.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
		Entry ent = (Entry) itr.next();
		System.out.println(ent.getKey()+"::::::>>>"+ent.getValue());
		}
	}
}
