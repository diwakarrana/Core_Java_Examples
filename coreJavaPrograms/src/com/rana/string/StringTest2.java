/**
 * There is NO method as nextChar() in java.util.Scanner class in Java.
 *  We need to use the next() method to read a single character as a string 
 *  and then use charAt(0) to get the first character of that string.
 *   Scanner scanner = new Scanner(System.in);
 *    char ch = scanner.next().charAt(0);
 * ..... . . .................................................................
 * write a program to input a string and print the character of given index
 */
package com.rana.string;

import java.util.Scanner;

public class StringTest2 {

	public static void main(String[] args) {
		System.out.println("enter string name");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("eneter index number");
		int index = scan.nextInt();
		char ch = str.charAt(index);
		System.out.println(ch);
	}

}
