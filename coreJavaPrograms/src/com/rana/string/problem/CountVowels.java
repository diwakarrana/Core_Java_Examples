/**
 * Count number of vowels in a string
 */

package com.rana.string.problem;
import java.util.Scanner;
public class CountVowels {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("what is your String");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for (int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch== 'a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u')
			{
				count++;
			}
		}
		System.out.println(count);
	}//end of main
}//end of class
