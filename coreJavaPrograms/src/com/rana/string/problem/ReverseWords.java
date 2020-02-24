/**
 * Write a java program to reverse a words in a given string?
Example : i love raudra and ravindra
		  ravindra and raudra love i
 */
package com.rana.string.problem;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		System.out.println("enter the sentences you wish to work on");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		//spliting given string into words......and hold in array of string
		String[] secondArray = str.split(" ");
		
		
		//reverse the array
		for (int i=0,j=secondArray.length-1; i<secondArray.length/2;i++,j--)
		{
			String temp = secondArray[i];
			secondArray[i] = secondArray[j];
			secondArray[j] = temp;
		}
		
		//printing the string.........
		for(int i=0; i<secondArray.length; i++)
		{
			System.out.print(secondArray[i]+" ");
		}

	}//end of main method
}//end of class
