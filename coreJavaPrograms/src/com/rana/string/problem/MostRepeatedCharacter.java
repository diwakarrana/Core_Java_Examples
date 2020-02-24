/**
 * find the most repeated character in the given string
 */
package com.rana.string.problem;

import java.util.Scanner;

public class MostRepeatedCharacter {

	public static void main(String[] args) {
		int targetIndex =0;
		int asciValOfChar = 0;
		int index = 0;
		int[] array = new int[26];
		int max = array[0];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your string on which you want to test ");
		String str = scan.nextLine().toLowerCase();
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			{
				asciValOfChar = str.charAt(i);
				index = asciValOfChar-'a';
				array[index]++;
			}
		}
		
		//searching maximum occuring of character and getting index
		for (int i=0; i<26; i++)
		{
			if(max < array[i])
			{
				max = array[i];
				targetIndex = i;
			}
		}
		
		//printing ascii value as character value 
		targetIndex += 'a';
		System.out.printf("%c",targetIndex);

	}
}
