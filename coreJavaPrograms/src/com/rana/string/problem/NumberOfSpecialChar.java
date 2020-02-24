/**
 * a string is given by user and u have to print the number of special characters
 * Defination of special characters....
 * 		"every character except number alphabets(both lower case and upper case) 
 * 		 and also space"
 */
package com.rana.string.problem;
import java.util.Scanner;
public class NumberOfSpecialChar {

	public static void main(String[] args) {
		System.out.println("enter string what you want to check");
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		
//		int str = ' ';
//		System.out.println(str);
//      //unicode of space is 32
		int speCharCount = 0;
		for(int i=0; i<str1.length();i++)
		{
			int d = str1.charAt(i);
			// space = 32
			// 0 to 0 = 48 to 57
			// A to Z = 65 to 90
			// a to z = 97 to 122
			// special char <48 && >57
			if(d <48 || d>57 && d<65 || d > 90 && d <97 || d >122 )
				if(d!=32)
					speCharCount++;
		}
		System.out.println(speCharCount);
	}// end of main
}// end of class
