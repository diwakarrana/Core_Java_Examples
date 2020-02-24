/**
 * In this example, we will create string object with different ways...
 */

package com.rana.string;

public class StringObjectDiffWays {

	public static void main(String[] args) {
		String str1 = "Diwakar Rana";
		System.out.println(str1);
		String str2 = new String("Diwakar Rana");
		System.out.println(str2);
		System.out.println(str1);
		String str3 = str1;
		System.out.println(str3);
		
		char[] a = {'a','b','c','d','e','f'};
		System.out.println(a);
		String str4 = new String(a,2,3);
		System.out.println(str4);
		
		
		

	}

}
