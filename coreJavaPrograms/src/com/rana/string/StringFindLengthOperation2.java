package com.rana.string;

import java.util.Scanner;

public class StringFindLengthOperation2 {

	public static void main(String[] args) {
		String s1 = "";
		String s2 = " ";
		String s3 = "ab";
		String s4 = new String();
		String s5 = new String("");
		String s6 = new String(" ");
		String s7 =new String("ab");
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s4.length());
		System.out.println(s5.length());
		System.out.println(s6.length());
		System.out.println(s7.length());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter String1 : ");
		System.out.println("you enetered " + scan.nextLine().length()+" characters");
		
		String s8 = "rana";
		String[] s9 = {"rana", "NIT"};
		
		//System.out.println(s8.length );
		System.out.println(s8.length());
		System.out.println(s9.length);
		//System.out.println(s9.length());
	}//end of main
}//end of class
