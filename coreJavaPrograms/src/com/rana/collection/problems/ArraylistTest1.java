
package com.rana.collection.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArraylistTest1 {

	public static void main(String[] args) {
		
	List<Integer> l1 = new ArrayList<Integer>();
	
	System.out.println("enter the values you want to sort");
	Scanner scan = new Scanner(System.in);
	l1.add(scan.nextInt());
	l1.add(scan.nextInt());
	l1.add(scan.nextInt());
	l1.add(scan.nextInt());
	l1.add(scan.nextInt());
	
	Iterator<Integer> itr = l1.iterator();
	while(itr.hasNext())
	System.out.println(itr.next());
	}
}
