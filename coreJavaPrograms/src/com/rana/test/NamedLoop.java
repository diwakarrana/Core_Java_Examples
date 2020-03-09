package com.rana.test;

public class NamedLoop {

	public static void main(String[] args) {
		
		// \u000d System.out.println("hi jaggi");
		loop1:
		for(int i=1; i<=5; i++)
			for(int j=1; j<=5; j++)
			{
				if(i==3)
					break loop1;
				System.out.println("i = "+i+" j = "+j);
			}
	}
}
