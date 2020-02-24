package com.rana.collection.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		int count = 0;
		System.out.println("************************************************************************");
		System.out.println("enter student details according to follow......");
		System.out.println("1: enetr rollNo");
		System.out.println("2: enetr name");
		System.out.println("3: enetr age");
		System.out.println("4: enetr fee");
		System.out.println("wants more input ...press 1");
		System.out.println("wants to exit ...press 2 ");
		System.out.println("************************************************************************");
		
		ArrayList<Student> studentList= new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
		
		Student s1 = new Student();
		s1.setRollNo(scan.nextInt());
		scan.nextLine();
		s1.setSname(scan.nextLine());
		s1.setSage(scan.nextInt());
		s1.setFee(scan.nextFloat());
		
		studentList.add(s1);
		
		if(scan.nextInt() == 1)
			continue;
		else
			break;
		
		}
		//using comparator interface to sort the arraylist....
		Collections.sort(studentList, new MySort());
		
		System.out.println("******************************output***************************************");
		
		ListIterator itr = studentList.listIterator();
		
		while(itr.hasNext())
		{	
			System.out.println( "detalis of student "+count);
			count++;
			Student s1 = (Student)itr.next();
			System.out.println(s1.getRollNo()+"  "+s1.getSname()+"  "+s1.getSage()+"  "+s1.getFee());
			System.out.println();
			System.out.println();
		}
	}

}
