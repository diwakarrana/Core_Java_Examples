package com.rana.pattern;

public class Pattern11 {

	public static void main(String[] args) {
	 for(int i=1; i<=5; i++)	
		pattern(i, i);
	 for(int i=4; i>=1; i--)	
			pattern(i, i);
	}
	
	static void pattern(int count, int n) {
		for(int i=1;i<=n; i++ )
		{
			System.out.print(count++);
		}
		count--;
		for(int i=1; i<n; i++)
		{
			System.out.print(--count);
		}
		System.out.println();
	}
}
