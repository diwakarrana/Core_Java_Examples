package com.rana.ArrayProblem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class MapTest1 {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(2, "rana");
		map1.put(6, "rashid");
		map1.put(9, "Diwakar");
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(101, "Hari Krishna");
		map2.put(102, "Natraz Chaudry");
		map2.put(108, "murli");
		map1.putAll(map2);
		
		System.out.println(map1);
		
		//......converting HashMap to SetMap so that traverse could be possible..
		
		Set set1 = map1.entrySet();
		
		Iterator itr = set1.iterator();
		while(itr.hasNext())
		{
			Map.Entry e= (Map.Entry)itr.next();
			
			System.out.println(e.getKey()+"  "+e.getValue());
		}
		
		
		
		
	}
}
