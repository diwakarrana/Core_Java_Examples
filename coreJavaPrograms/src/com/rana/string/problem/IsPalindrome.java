/**
 * check weather given string is palindrome or not
 */
package com.rana.string.problem;

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		boolean flag =true;
		System.out.println("enter string which is to be check");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();	
		//System.out.println(str);
		int i =0, j = str.length()-1, condition = str.length()/2;
		for(;i<condition;i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))
			 {
				System.out.println("given String is not palindrome");
				flag = false;
				break;
			 }
		}	
		if(flag)
		System.out.println("given string is palindrome");
	}
}
