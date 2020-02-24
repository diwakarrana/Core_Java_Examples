/**
 * checking string is empty or not
 */
package com.rana.string;

import java.util.Scanner;

public class StringIsEmptyOperation1 {

	public static void main(String[] args) {
		String s1 = "";
		System.out.println("S1 is empty? " + s1.isEmpty());
//...........................................................		
		String s2 = " ";
		System.out.println("S2 is empty? " + s2.isEmpty());
//..........................................................		
		String s3 = "a";
		System.out.println("S3 is empty? " + s3.isEmpty());
//............................................................		
		String s4 = new String();
		System.out.println("S4 is empty? " + s4.isEmpty());
//............................................................		
		String s5 = new String(" ");
		System.out.println("S5 is empty? " + s5.isEmpty());
//............................................................		
		try {
		String s6 = null;
		//System.out.println(s6);
		System.out.println("S6 is empty? " + s6.isEmpty());
		}
		catch(Exception e)
		{
			System.out.println("null pointer exception");
		}
//..................................................................
		String s7;
		//System.out.println("s7 is empty? " + s7.isEmpty());
//...................................................................
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter String1: ");
		System.out.println(scan.nextLine().isEmpty());   
	
	}//end of main method 
}//end of class
