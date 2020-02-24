/**
 * 
 * Write a java program to count the number of times
 *  token string appeared in given target string? 
 *  Input: TargetString : java is a programming language.
 *   It is mostly used in big data applications
 *   
 *   TokenString: is
 *   Output: 2
 * 
 */

/**
 * the time complexity of this algo is more O(n2)
 */

package com.rana.string.problem;

import java.util.Scanner;

public class SubStringOccurence {
	
	static int  count =0;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your string");
		String text = scan.nextLine();
		System.out.println("enter your pattern that is to search");
		String pattern = scan.nextLine();
		
		patternMatching(text,pattern);
		
		System.out.println(count);
	}

	private static void patternMatching(String text, String pattern )
	{
		
		for(int i=0; i < text.length()-pattern.length(); i++)
		{
			int j;// for accessing outside the loop
			
			for(j=0; j<pattern.length(); j++)
			{
				if(text.charAt(i+j)!=pattern.charAt(j))
				{
					break;
				}
			}
			
			if(j == pattern.length())
			{
				count ++;
				j=0;
			}
		}
	}
}
