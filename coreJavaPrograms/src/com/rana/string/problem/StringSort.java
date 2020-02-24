/**
 * Write a java program to sort the given string?
	Example: input : rana
			 output : aanr
 */

package com.rana.string.problem;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		System.out.println("enter string you want to sort");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		// string to character conversion...
		char[] charArray = str.toCharArray();
		
		//sort() method of array class....
		Arrays.sort(charArray);
		
		//char array to string conversion...
		String str1 = new String(charArray);
		System.out.println(str1);
		

	}

}
