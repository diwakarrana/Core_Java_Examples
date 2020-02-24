/**
 *program for printing first non repeating character in string
 */

package com.rana.string.problem;
import java.util.Scanner;
public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		System.out.println("Enter your string");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		boolean status = true;
	
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			//System.out.println(ch);
			int j=i+1;
			for( ; j<str.length();j++)
			{
				if(ch == str.charAt(j))
				{
					status = false;
					break;
				}
			}
			if(status)
			{
				System.out.println("first non repeating character \n"+ch);
				break;
			}
			if(!status)
			{
				status = true;
			}
		}//outer loop
	}//main
}//class
