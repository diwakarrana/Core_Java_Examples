/**
 * Write a java program to remove characters from the first string
 *  which are present in the second string?
 */

package com.rana.string.problem;

import java.util.Scanner;

public class RemoveCharPresentInGivenString {

	public static void main(String[] args) {
		System.out.println("enter first string from which character is to be removed");
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine().toLowerCase();
		System.out.println("enter second string of which character is to removed");
		String str2 = scan.nextLine().toLowerCase();
		int[] array = new int[26];
		for (int i = 0; i < str2.length(); i++) {
			if (str2.charAt(i) != ' ') {
				if (array[str2.charAt(i) - 'a'] == 0)
					array[str2.charAt(i) - 'a']++;
			}

		}
	
		StringBuffer str3 = new StringBuffer();
		  
		for(int j=0; j< str1.length(); j++)
		{
			if(str1.charAt(j)!=' ')
			{
				if(array[str1.charAt(j)-'a'] == 0 ) 
				{
					str3 = str3.append(str1.charAt(j));
				}	
			}
			else
				str3 = str3.append(' ');
		}  
		  
		System.out.println(str3);
		 
	}
}
