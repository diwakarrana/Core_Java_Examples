/**
 * write a program that sort lexicographically assending to strings....
 */
package com.rana.string.problem;
import java.util.Scanner;
public class LexicographicalSortingOfString {

	public static void main(String[] args) {
	
		//user will asked to input number of string
		System.out.println("enter number of string you want to enter");
		Scanner scan = new Scanner(System.in);
		int stringCount = scan.nextInt();
		
		
		//array os string is created......
		String[] stringArray = new String[stringCount];// String stringArray[];
		
		
		// take input from user 
		Scanner scan2 = new Scanner(System.in);
		for(int i=0; i<stringCount; i++)
		{
			stringArray[i] = scan2.nextLine();
		}
		
		
		// sorting logic i m using bubble sort here  
		for (int i=0; i <stringCount-1; i++)
		{
			for(int j=0; j <stringCount-1-i; j++)
			{
				if(stringArray[j].compareTo(stringArray[j+1]) > 0)
				{
					String temp = stringArray[j];
					stringArray[j] = stringArray[j+1];
					stringArray[j+1] = temp;
				}
				
			}
		}
		
		//printing all string 
		for (int i=0; i<stringCount; i++)
		{
			System.out.println(stringArray[i]);
		}
	}//end of main
}//end of class
