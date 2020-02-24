package com.rana.collection.problems;

import java.util.Comparator;

public class MySort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getRollNo()-o2.getRollNo();
	}

}
