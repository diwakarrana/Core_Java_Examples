
/**
 * 
 * Write a java program to print all the duplicate characteres in the given string?
 */
package com.rana.string.problem;

import java.util.Scanner;

public class AllDuplicateCharPrinting {

	public static void main(String[] args) {
		System.out.println("neter your string you ant to enter");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine().toLowerCase();
		int[] array = new int[26];
		
		for (int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			{
				int d = str.charAt(i);
				int e = d -'a';
				array[e]++;
			}
		}
		
		for (int i=0; i < 26; i++)
		{
			if (array[i] >1)
			{
				System.out.printf("%c"+" ",i+'a');
				System.out.println(array[i]);
			}		
		}

	}

}
