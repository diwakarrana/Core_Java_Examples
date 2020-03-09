package com.rana.pattern;

public class PatternTest {

	public static void main(String[] args) {
		
		int count =1;
		for(int i =1; i<=3; i++)
			{
			for(int j=10-i; j>=1; j--)
				System.out.print(" ");
			for(int j=1; j<=2*i-1; j++,count++)
				System.out.print(count*count+" ");
			System.out.println();
			}//end of for loop
	}//end of main
}//end of class


