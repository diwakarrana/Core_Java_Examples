/**
 * reversing a string....
 */

package com.rana.string.problem;


public class ReverseString {

	public static void main(String[] args) {
//here i m calling static method so no necessity of creating object
		String str = "Diwakar Rana";
		System.out.println("before reversing"+str);
		str = reverseStringFirst(str);
		System.out.println("after reversing"+str);
		
//here object creation is required to create object of non static 
//method
		StringBuilder str1 = new StringBuilder();
		str1.append(str);
		ReverseString obj = new ReverseString();
		str1 =obj.reverseStringSecond(str1);
		System.out.println("after second reverse"+str1);
		
		
		String str4 = "Yogendra Singh Rana";
		String str5  = new StringBuffer(str4).reverse().toString();
		System.out.println(str5);
		
	}//end of main method
// here i define a reverse function hard coded......	
	private static String reverseStringFirst(String str)
	{
		String str1 = "";
		for(int i = str.length()-1; i>=0 ;  i--)
		{
			str1 += str.charAt(i);
		}
		return str1;
	}
// here i create a non static functon to reverse a string with help of reverse()
// and append() method of class StringBuilder 
	StringBuilder reverseStringSecond(StringBuilder str)
	{
		str = str.reverse();
		return str;
	}
}//end of class
