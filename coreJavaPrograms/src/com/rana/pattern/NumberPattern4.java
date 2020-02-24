package com.rana.pattern;

import java.util.Scanner;

public class NumberPattern4 {

	public static void main(String[] args) {
		
		System.out.println("enter the height of pyramid ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count =1;
		for(int i=1; i<=n; i++)
		{
			for(int k= n+5-i; k>=1; k--)
			{
				System.out.printf(" ");
			}
			
			
			for(int j = count; j>=1; j--)
				System.out.printf("%d", j);
			count++;
			System.out.println();
		}
	}
}
