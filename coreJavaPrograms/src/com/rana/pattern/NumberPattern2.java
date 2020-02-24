package com.rana.pattern;

import java.util.Scanner;

public class NumberPattern2 {

	public static void main(String[] args) {
		
		System.out.println("enter the height of pyramid ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count = 1;
		
		for(int i=1; i<=n; i++)
		{   
			for(int j = 1; j<=i; j++)
				{
					System.out.printf(" %d", count);
					count++;
				}
			System.out.println();
		}
	}
}
